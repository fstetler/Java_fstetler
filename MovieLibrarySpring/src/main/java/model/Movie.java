package model;

public class Movie {

    private String movieName;

    private Double movieRating;

    public Movie(String movieName, Double movieRating) {
        this.movieName = movieName;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(Double movieRating) {
        this.movieRating = movieRating;
    }
}
