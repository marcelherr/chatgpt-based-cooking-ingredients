package com.example.chatgptbasedcookingingredients.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/open/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    @PostMapping
    String categorizeIngredient(@RequestBody String ingredient) {

        // TODO: This should return "vegan", "vegetarian" or "regular" depending on the ingredient.


        private final IngredientService ingredientService;

        return ingredientService.checkIngredient(ingredient);
    }

}
