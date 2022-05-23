package com.springboot.DependencyInjection.controllers;

import com.springboot.DependencyInjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    //best practice : use private final so that you can't change the object once you're inside the object code

    // we don't really need @Autowired, it's optional
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
