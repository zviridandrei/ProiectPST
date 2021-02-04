package com.example.demo.controller;

import com.example.demo.model.Cumparare;
import com.example.demo.services.CumparareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cumparare")
public class CumparareController {

    private CumparareService cumparareService;

    @Autowired
    public CumparareController(CumparareService cumparareService)
    {
        this.cumparareService=cumparareService;
    }

    //GET
    @GetMapping
    public List<Cumparare> getAllCumparare()
    {
        return cumparareService.getAllCumparare();
    }

    @GetMapping("/{id}")
    public Cumparare getCumparare(Integer id)
    {
        return cumparareService.getCumparare(id);
    }

    @PostMapping
    public Cumparare createFilme(@RequestBody Cumparare rating)
    {
        return cumparareService.createCumparare(rating);
    }
}
