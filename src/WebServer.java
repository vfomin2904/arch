import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(ServerConstants.PORT)) {
            System.out.println("Server started!");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");
                Client client = new Client(socket);

                new Thread(client::handleRequest).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}