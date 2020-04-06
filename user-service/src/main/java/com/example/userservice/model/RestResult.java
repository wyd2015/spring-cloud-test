package com.example.userservice.model;

/**
 * @Author: wcg
 * @Date: 2020/3/22 14:42
 */
public class RestResult {
    private int code = 0;
    private Object data;
    private String message;

    public RestResult() {
    }

    public RestResult(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
