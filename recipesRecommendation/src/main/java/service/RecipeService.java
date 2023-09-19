package service;

import model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RecipeRepository;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    public RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe getTest() {
        return new Recipe(1, "shitrecipe", 0);
    }

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

}
