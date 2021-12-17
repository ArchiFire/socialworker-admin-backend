package com.archifire.socialworker.entrypoints.assets;

import lombok.Getter;

public enum ResultCode {
    OK("000", "OK"),
    BAD_REQUEST("400", "Bad Request"),
    RESOURCE_NOT_FOUND("404", "Resource Not Found");

    @Getter
    public String code;

    @Getter
    public String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
