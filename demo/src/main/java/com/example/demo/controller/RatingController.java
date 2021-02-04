package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService)
    {
        this.ratingService=ratingService;
    }

    //GET
    @GetMapping
    public List<Rating> getAllRating()
    {
        return ratingService.getAllRating();
    }

    @GetMapping("/{id}")
    public Rating getRating(Integer id)
    {
        return ratingService.getRating(id);
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating)
    {
        return ratingService.createRating(rating);
    }
}
