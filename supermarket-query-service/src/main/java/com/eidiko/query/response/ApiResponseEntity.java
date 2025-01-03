package com.eidiko.query.response;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;

public class ApiResponseEntity<T> {

    private HttpStatus code;
    private String message;
    private T data;

    public ApiResponseEntity() {
    }

    public ApiResponseEntity(HttpStatus code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
