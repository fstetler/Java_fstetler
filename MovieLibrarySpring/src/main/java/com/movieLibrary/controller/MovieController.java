package com.movieLibrary.controller;

import com.movieLibrary.model.Movie;
import com.movieLibrary.repository.MovieRepository;
import com.movieLibrary.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieController {

    @Autowired
    public MovieService movieService;

    @GetMapping("/getMovie")
    public Optional<Movie> getMovie(Movie movie) {
        return movieService.getMovie(movie);
    }

    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/getTest")
    public Movie getTest() {
        return new Movie(1, "shitmovie", 1.1);
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

}
