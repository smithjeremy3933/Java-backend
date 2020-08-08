package com.examplebackend.Backend.payload;

public class SignupRequestResponse {

    private boolean success;
    private String message;

    public SignupRequestResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SignupRequestResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
