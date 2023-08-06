package com.example.hw11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {


    @GetMapping(path = "/name")
    public String name(){
        return "My name is Lujain";
    }


    @GetMapping(path = "/age")
    public int age(){
        return 23;
    }


    @GetMapping(path = "/check/status")
    public String status(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }
@GetMapping(path = "/names")
public String [] names(){
    String [] names = {"Lujain", "Amal", "Lana"};

        return names;
}
}
