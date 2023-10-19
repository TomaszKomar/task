package com.orange.task.common;

public record ErrorDto(String id, String message) {
    public static ErrorDto from(NotFoundException notFoundException) {
        return new ErrorDto(notFoundException.code, notFoundException.getMessage());
    }
}
