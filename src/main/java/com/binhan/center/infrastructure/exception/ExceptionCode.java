package com.binhan.center.infrastructure.exception;

import lombok.Getter;

@Getter
public enum ExceptionCode {
    WEEK_PLAN_NOT_FOUND(10001, "week plan not found.");

    private final int code;
    private final String message;

    ExceptionCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
