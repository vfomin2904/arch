package ru.geekbrains.domain;

public class HttpResponse {

    private ResponseType type;
    private StringBuilder response = new StringBuilder();

    private HttpResponse () {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final HttpResponse httpResponse;

        private Builder() {
            httpResponse = new HttpResponse();
        }

        public Builder withResponseType(ResponseType type) {
            this.httpResponse.type = type;
            return this;
        }

        public HttpResponse build(){
            return this.httpResponse;
        }
    }

    public ResponseType getType() {
        return type;
    }

    public StringBuilder getResponse() {
        return response;
    }
}
