package com.java_api_sample.sample.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import 

@RestController
@RequestMapping("/api/issues/")
public class IssueController {
    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    Gson calculateSumOfStoryPoints(
        @RequestBody String query,
        @RequestBody String name
        ) {
            Gson gson = new Gson();
            gson.put("success", new Boolean(true));
            gson.put("message", "");

            return jsonObj;
    }
}
