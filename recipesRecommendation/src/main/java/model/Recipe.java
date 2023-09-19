package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "RecipeName")
    private String recipe;

    @Column(name = "RecipeRating")
    private Integer rating;

}
