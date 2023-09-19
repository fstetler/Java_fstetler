package controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RecipeService;

import java.util.List;

@RestController
@RequestMapping("/recipe")
@RequiredArgsConstructor
public class RecipeController {

    @Autowired
    public RecipeService recipeService;

    @GetMapping("/getTest")
    public Recipe getTestRecipe() {
        return recipeService.getTest();
    }

    @GetMapping("/getAllRecipes")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @PostMapping("/addRecipe")
    public Recipe addRecipe(Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }
}
