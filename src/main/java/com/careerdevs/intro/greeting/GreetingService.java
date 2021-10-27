package com.careerdevs.intro.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private Greeting greeting = new Greeting(1L, "Hello World");
//    private String greeting = "Hello World";

    public GreetingService() {

    }

    public Greeting getGreeting() {
        return greeting;
    }
}
