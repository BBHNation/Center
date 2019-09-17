package com.binhan.center.infrastructure.exception;

import lombok.Getter;

@Getter
class ApplicationError {
    private final int code;
    private final String message;

    ApplicationError(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
