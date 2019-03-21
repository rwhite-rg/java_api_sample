package com.java_api_sample.sample.models;

public class JiraApiResponse {
    private final String jsonResponse;

    public JiraApiResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }

    public String getJsonResponse() {
        return jsonResponse;
    }
}
