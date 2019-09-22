package com.stackroute;


import org.springframework.stereotype.Component;

@Component
public class Message {

private String message="this is spring";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
