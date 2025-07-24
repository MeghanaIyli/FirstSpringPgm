package com.meghana.FirstSpringPgm.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFirstSpringController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @PostMapping("/greetFirstPgm")
    public String greet(@RequestBody String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/greetRequest")
    public String greetRequest(@RequestBody GreetRequest request){
        return "Hi " + request.getName() + ", welcome!";
    }

    public static class GreetRequest {
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}


