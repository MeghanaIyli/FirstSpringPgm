package com.meghana.FirstSpringPgm.Controller;

import com.meghana.FirstSpringPgm.model.GreetRequest;
import com.meghana.FirstSpringPgm.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping
    public String greet(@RequestBody GreetRequest request) {
        return greetingService.generateGreeting(request.getName(), request.getLanguage());
    }
}
