package com.movieLibrary.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "MOVIE_RATING")
    private double movieRating;

}
