package com.movieLibrary.controller;

import com.movieLibrary.model.Movie;
import com.movieLibrary.repository.MovieRepository;
import com.movieLibrary.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieController {

    public MovieRepository movieRepository;

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
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}
