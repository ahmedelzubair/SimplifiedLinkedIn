package com.ahmedelzubair.simplifiedlinkedin.common;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private String field;
    private int status;
}
