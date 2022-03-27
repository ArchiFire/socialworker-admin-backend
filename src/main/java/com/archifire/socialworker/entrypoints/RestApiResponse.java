package com.archifire.socialworker.entrypoints;

import java.io.Serializable;

import com.archifire.socialworker.entrypoints.assets.ResultCode;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class RestApiResponse<T> implements Serializable {
    private static final long serialVersionUID = -758316825465773691L;

    String code;
    String message;
    T data;
    StackTraceElement[] stackTrace;

    @JsonIgnore
    public static <T> RestApiResponse<T> ok(T data){
        RestApiResponse res = new RestApiResponse();
        res.code = ResultCode.OK.code;
        res.message = ResultCode.OK.message;
        res.data = data;
        return res;
    }
}
