package com.movieLibrary.service;

import com.movieLibrary.model.Movie;
import org.springframework.stereotype.Service;
import com.movieLibrary.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }


}
