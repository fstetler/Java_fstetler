package com.movieLibrary.controller;

import com.movieLibrary.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieController {

    @GetMapping("/getMovie")
    public Movie getMovie() {
        return new Movie(1, "Golden Eye", 8.5);
    }

}
