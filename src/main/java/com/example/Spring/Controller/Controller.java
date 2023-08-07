package com.example.Spring.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    //Controller takes request and gives you back

    @RequestMapping(value = {"/", "homepage"})
    public String homePage() {
        return "Welcome to my First Spring Application";
    }// Must always return something(For every request, you need something!)



    @RequestMapping(value = "/electronics")
    public String electronics() {
        return "Electronics";
    }

    @RequestMapping(value = "/video-games")
    public String videoGames() {
        return "Video Games";
    }
}
