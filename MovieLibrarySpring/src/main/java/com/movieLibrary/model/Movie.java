package com.movieLibrary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {

    @Id
    private Integer id;

    private String movieName;

    private Double movieRating;

}
