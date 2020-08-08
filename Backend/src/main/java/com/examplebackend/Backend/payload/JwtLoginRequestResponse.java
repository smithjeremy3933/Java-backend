package com.examplebackend.Backend.payload;

public class JwtLoginRequestResponse {

    private boolean success;
    private String token;

    public JwtLoginRequestResponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "JwtLoginRequestResponse{" +
                "success=" + success +
                ", token='" + token + '\'' +
                '}';
    }
}
