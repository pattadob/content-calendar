package com.example.contentcalendar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @Value("${cc.welcome-message:Default Welcome Message}")
    private String welcomeMessage;

    @Value("${cc.about:Default About Message}")
    private String aboutMessage;

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("welcome", welcomeMessage, "about", aboutMessage);
    }
}
