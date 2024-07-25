package com.example.chatgptbasedcookingingredients.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestClient;

@Service
public class IngredientService {

    private final RestClient restClient;

    public IngredientService(@Value("${BASE_URL}") String baseUrl,
                             @Value("${AUTH_KEY}") String key) {
        restClient = RestClient.builder()
                .defaultHeader("Authorization", "Bearer " + key)
                .baseUrl(baseUrl)
                .build();
    }

    public String checkIngredient(String ingredient) {
        
    }
}
