package com.gs.bean;

/**
 * Created by Administrator on 2017/9/8.
 */
public class ControllerResult {
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    public static ControllerResult getSuccessResult(String message) {
        return new ControllerResult(SUCCESS, message);
    }

    public static ControllerResult getFailResult(String message) {
        return new ControllerResult(FAIL, message);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String result;
    private String message;

    public ControllerResult() {}
    public ControllerResult(String result, String message) {
        this.result = result;
        this.message = message;
    }
}
