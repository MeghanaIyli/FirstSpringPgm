package com.meghana.FirstSpringPgm.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String generateGreeting(String name, String language) {
        if ("kannada".equalsIgnoreCase(language)) {
            return "Namaskara " + name;
        } else if ("hindi".equalsIgnoreCase(language)) {
            return "Namaste " + name;
        } else {
            return "Hello " + name;
        }
    }
}
