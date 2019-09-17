package com.binhan.center.infrastructure.exception;

import java.util.function.Supplier;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {
    private final int code;

    public NotFoundException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.code = exceptionCode.getCode();
    }

    public static Supplier<NotFoundException> weekplanNotFoundException() {
        return () -> new NotFoundException(ExceptionCode.WEEK_PLAN_NOT_FOUND);
    }
}
