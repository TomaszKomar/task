package com.orange.task.common;


public class NotFoundException extends RuntimeException {
    String code;
    public NotFoundException(String code, String message) {
        super(message);
        this.code = code;
    }
}
