package ru.geekbrains.domain;

public enum ResponseType {

    OK("200", "OK"),
    METHOD_NOT_ALLOWED("405", "METHOD_NOT_ALLOWED"),
    NOT_FOUND("404", "NOT_FOUND");

    private final String code;
    private final String description;

    ResponseType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
