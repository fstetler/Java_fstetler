package com.movieLibrary.service;

import com.movieLibrary.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieLibrary.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Optional<Movie> getMovie(Movie movie) {
        return movieRepository.findById(movie.getId());
    }

    public Movie getTest() {
        return new Movie(1, "shitmovie", 1.1);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }


}
