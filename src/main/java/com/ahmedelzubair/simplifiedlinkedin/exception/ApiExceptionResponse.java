package com.ahmedelzubair.simplifiedlinkedin.exception;

import java.time.ZonedDateTime;

public class ApiExceptionResponse {
    private final String message;
    private final int status;
    private final ZonedDateTime timestamp;
    private final Throwable throwable;

    public ApiExceptionResponse(String message, int status, Throwable throwable) {
        this.message = message;
        this.status = status;
        this.timestamp = ZonedDateTime.now();
        this.throwable = throwable;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public Throwable getThrowable() {
        return throwable;
    }


}
