package com.example.droolsengine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class LogisticsController {

    @GetMapping(path = "/ping", produces = "application/json")
    public HashMap<String, Boolean> ping() {
        HashMap<String, Boolean> result = new HashMap<>();
        result.put("ping", true);
        return result;
    }
}
