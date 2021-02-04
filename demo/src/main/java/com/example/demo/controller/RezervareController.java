package com.example.demo.controller;

import com.example.demo.model.Rezervare;
import com.example.demo.services.RezervareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rezervare")
public class RezervareController {
    private RezervareService rezervareService;

    @Autowired
    public RezervareController(RezervareService rezervareService)
    {
        this.rezervareService=rezervareService;
    }

    //GET
    @GetMapping
    public List<Rezervare> getAllRezervare()
    {
        return rezervareService.getAllRezervare();
    }

    //GET dupa ID
    @GetMapping("/{id}")
    public Rezervare getRezervare(Integer id)
    {
        return rezervareService.getRezervare(id);
    }

    //POST
    @PostMapping
    public Rezervare createRezervare(@RequestBody Rezervare rezervare)
    {
        return rezervareService.createRezervare(rezervare);
    }
}
