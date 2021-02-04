package com.example.demo.controller;

import com.example.demo.model.Filme;
import com.example.demo.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    private FilmeService filmeService;

    @Autowired
    public FilmeController(FilmeService filmeService)
    {
        this.filmeService=filmeService;
    }

    //GET
    @GetMapping
    public List<Filme> getAllFilme()
    {
        return filmeService.getAllFilme();
    }

    @GetMapping("/{id}")
    public Filme getFilme(Integer id)
    {
        return filmeService.getFilme(id);
    }

    @PostMapping
    public Filme createFilme(@RequestBody Filme rating)
    {
        return filmeService.createFilme(rating);
    }
}
