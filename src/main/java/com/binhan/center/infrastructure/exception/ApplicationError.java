package com.binhan.center.infrastructure.exception;

import lombok.Getter;

@Getter
public class ApplicationError {
    private final int code;
    private final String message;

    public ApplicationError(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
