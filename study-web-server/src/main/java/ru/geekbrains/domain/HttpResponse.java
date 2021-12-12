package ru.geekbrains.domain;

public class HttpResponse {

    private ResponseType type;
    private StringBuilder response;

    public HttpResponse(ResponseType type) {
        this.type = type;
        this.response = new StringBuilder();
    }

    private void getResponseHeader() {
        response.append("HTTP/1.1 ");
        response.append(type.getCode()+" ");
        response.append(type.getDescription());
        response.append("\n");
        response.append("Content-Type: text/html; charset=utf-8\n");
        response.append("\n");
    }

    public String getResponse(String body) {
        getResponseHeader();
        response.append(body);
        return response.toString();
    }

}
