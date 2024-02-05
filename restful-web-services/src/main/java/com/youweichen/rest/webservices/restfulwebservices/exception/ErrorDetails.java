package com.youweichen.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    //timestamp
    private LocalDateTime timestamp;
    //message
    private String message;
    //details
    private String details;
}
