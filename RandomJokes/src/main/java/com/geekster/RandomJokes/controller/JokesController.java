package com.geekster.RandomJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {

    static ArrayList<String> jokesList = new ArrayList<>();

    @PostMapping(value ="/jokes")
    public String saveJoke(@RequestBody String joke) {
        jokesList.add(joke);
        return "saved joke";
    }

    @GetMapping(value ="/jokes")
    public String getJokes(){

        int randomNumber = 0 + (int)(Math.random() * ((jokesList.size()-1-0)+1));
        return jokesList.get(randomNumber);
    }
}
