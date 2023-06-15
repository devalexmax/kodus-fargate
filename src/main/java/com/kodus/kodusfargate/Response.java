package com.kodus.kodusfargate;

import java.util.Objects;

public class Response {
    private String message;
    private String status;

    public Response() {
    }

    public Response(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response response)) return false;
        return getMessage().equals(response.getMessage()) && getStatus().equals(response.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getStatus());
    }
}
