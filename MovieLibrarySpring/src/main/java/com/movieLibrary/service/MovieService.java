package com.movieLibrary.service;

import com.movieLibrary.model.Movie;
import com.movieLibrary.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public Movie getMovieById(Integer id) {
        return movieRepository.getReferenceById(id);
    }


    public Movie addMovie(Movie movie) {
        movieRepository.findAll().forEach(m -> {
            if (m.getId() == movie.getId()) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The ID is used already");
            }
        });

        return movieRepository.save(movie);
    }

    public void deleteMovieById(Movie movie) {
        movieRepository.deleteById(movie.getId());
    }
}
