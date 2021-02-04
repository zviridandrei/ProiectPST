package com.example.demo.services;

import com.example.demo.model.Rating;
import com.example.demo.repo.Rating_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingService {

    private Rating_repo rating_repo;

    @Autowired
    public RatingService(Rating_repo rating_repo) {
        this.rating_repo = rating_repo;
    }

    //GET
    public List<Rating> getAllRating()
    {
        List<Rating> rating = new ArrayList<>();
        rating_repo.findAll().forEach(x -> rating.add(x));
        return rating;
    }

    //Get by ID
    public Rating getRating(Integer id)
    {
        return rating_repo.findById(id).get();
    }

    //POST
    public Rating createRating(@RequestBody Rating rating)
    {
        return rating_repo.save(rating);
    }

}
