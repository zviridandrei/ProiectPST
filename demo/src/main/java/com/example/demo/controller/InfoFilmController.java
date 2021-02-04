package com.example.demo.controller;

import com.example.demo.model.InfoFilm;
import com.example.demo.services.InfoFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/infofilm")
public class InfoFilmController {

    private InfoFilmService infoFilmService;

    @Autowired
    public InfoFilmController(InfoFilmService infoFilmService)
    {
        this.infoFilmService=infoFilmService;
    }

    //GET
    @GetMapping
    public List<InfoFilm> getAllInfoFilm()
    {
        return infoFilmService.getAllInfoFilm();
    }

    @GetMapping("/{id}")
    public InfoFilm getInfoFilm(Integer id)
    {
        return infoFilmService.getInfoFilm(id);
    }

    @PostMapping
    public InfoFilm createInfoFilm(@RequestBody InfoFilm rating)
    {
        return infoFilmService.createInfoFilm(rating);
    }
}
