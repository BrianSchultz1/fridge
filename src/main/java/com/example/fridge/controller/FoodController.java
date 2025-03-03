package com.example.fridge.controller;

import com.example.fridge.model.Food;
import com.example.fridge.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }
}
