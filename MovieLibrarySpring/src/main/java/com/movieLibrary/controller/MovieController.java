package com.movieLibrary.controller;

import com.movieLibrary.model.Movie;
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

    @GetMapping(path = "/getMovieById/{id}")
    public Movie getMovieById(@PathVariable("id") Movie movie) {
        return movieService.getMovieById(movie.getId());
    }

    @GetMapping("/getTest")
    public Movie getTest() {
        return movieService.getTest();
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @DeleteMapping("/deleteMovieById/{id}")
    public void deleteMovie(@PathVariable("id") Movie movie) {
        movieService.deleteMovieById(movie);
    }
}
