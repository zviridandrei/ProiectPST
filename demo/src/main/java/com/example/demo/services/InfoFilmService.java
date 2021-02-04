package com.example.demo.services;

import com.example.demo.model.InfoFilm;
import com.example.demo.repo.InfoFilm_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoFilmService {

    private InfoFilm_repo infoFilm_repo;

    @Autowired
    public InfoFilmService ( InfoFilm_repo infoFilm_repo )
    {
        this.infoFilm_repo = infoFilm_repo;
    }

    //GET
    public List<InfoFilm> getAllInfoFilm()
    {
        List<InfoFilm> rezervare = new ArrayList<>();
        infoFilm_repo.findAll().forEach(x -> rezervare.add(x));
        return rezervare;
    }

    //GET BY ID
    public InfoFilm getInfoFilm(Integer id)
    {
        return infoFilm_repo.findById(id).get();
    }

    //POST
    public InfoFilm createInfoFilm(@RequestBody InfoFilm rezervare)
    {
        return infoFilm_repo.save(rezervare);
    }
}
