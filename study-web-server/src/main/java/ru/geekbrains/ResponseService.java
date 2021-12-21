package ru.geekbrains;

import ru.geekbrains.domain.HttpResponse;
import ru.geekbrains.domain.ResponseType;

public class ResponseService {

    private HttpResponse httpResponse;

    ResponseService(ResponseType responseType) {
        httpResponse = HttpResponse.builder()
                .withResponseType(responseType)
                .build();
    }

    private void getResponseHeader() {
        httpResponse.getResponse().append("HTTP/1.1 ");
        httpResponse.getResponse().append(httpResponse.getType().getCode()+" ");
        httpResponse.getResponse().append(httpResponse.getType().getDescription());
        httpResponse.getResponse().append("\n");
        httpResponse.getResponse().append("Content-Type: text/html; charset=utf-8\n");
        httpResponse.getResponse().append("\n");
    }

    public String getResponse(String body) {
        getResponseHeader();
        httpResponse.getResponse().append(body);
        return httpResponse.getResponse().toString();
    }
}
