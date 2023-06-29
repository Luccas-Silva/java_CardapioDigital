package com.example.Menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Menu.Food.Food;
import com.example.Menu.Food.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
	private FoodRepository repository;
	
	@GetMapping
	public List<Food> getAll() {
		
		List<Food> foodlist = repository.findAll();
		return foodlist;
	}
}
