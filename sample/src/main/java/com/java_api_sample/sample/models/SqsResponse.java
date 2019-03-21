package com.java_api_sample.sample.models;

public class SqsResponse {
    private final String jsonResponse;

    public SqsResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }

    public String getJsonResponse() {
        return jsonResponse;
    }
}
