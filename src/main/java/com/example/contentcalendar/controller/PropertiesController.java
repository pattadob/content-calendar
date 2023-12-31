package com.example.contentcalendar.controller;

import com.example.contentcalendar.config.ContentCalendarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    private ContentCalendarProperties properties;

    public PropertiesController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/properties")
    public ContentCalendarProperties properties() {
        return properties;
    }
}
