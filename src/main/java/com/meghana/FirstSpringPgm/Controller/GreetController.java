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

    
    @GetMapping("/greetWithLang")
    public String greetUser(@RequestParam(required = false) String name,String lang) {
        return greetingService.generateGreeting(name,lang);
    }
// Final test push - Meghana Iyli

    @GetMapping("/greetUserGuest")
    public String greetUserGuest(@RequestParam(required = false) String name) {
        return greetingService.greetGuest(name);
    }

    @PostMapping("/greetPostGuest")
    public String greetUserPost(@RequestBody GreetRequest request) {
        return greetingService.greetGuestLang(request.getName(),request.getLanguage());
    }
}
