package ru.geekbrains;

import ru.geekbrains.domain.HttpRequest;
import ru.geekbrains.domain.HttpResponse;
import ru.geekbrains.domain.ResponseType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Deque;

import static ru.geekbrains.Config.WWW;

public class RequestHandler implements Runnable {

    private final SocketService socketService;
    private final RequestParser requestParser;

    public RequestHandler(SocketService socketService, RequestParser requestParser) {
        this.socketService = socketService;
        this.requestParser = requestParser;
    }

    @Override
    public void run() {
        Deque<String> rawRequest = socketService.readRequest();
        HttpRequest httpRequest = requestParser.parseRequest(rawRequest);
        if (httpRequest.getMethod().equals("GET")) {
            Path path = Paths.get(WWW, httpRequest.getUrl());

            if (!Files.exists(path)) {
                ResponseService resp = new ResponseService(ResponseType.NOT_FOUND);
                socketService.writeResponse(resp.getResponse("<h1>Файл не найден!</h1>"));
                return;
            }
            ResponseService resp = new ResponseService(ResponseType.OK);
            StringBuilder content = new StringBuilder();
            try {
                Files.readAllLines(path).forEach(content::append);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
            socketService.writeResponse(resp.getResponse(content.toString()));
        } else {
            ResponseService resp = new ResponseService(ResponseType.METHOD_NOT_ALLOWED);
            socketService.writeResponse(resp.getResponse("<h1>Метод не поддерживается!</h1>"));
            return;
        }
        try {
            socketService.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Client disconnected!");
    }
}
