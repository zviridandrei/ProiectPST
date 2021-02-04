package com.example.demo.services;

import com.example.demo.model.Rezervare;
import com.example.demo.repo.Rezervare_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class RezervareService {

    private Rezervare_repo rezervare_repo;

    @Autowired
    public RezervareService ( Rezervare_repo rezervare_repo )
    {
        this.rezervare_repo = rezervare_repo;
    }

    //GET
    public List<Rezervare> getAllRezervare()
    {
        List<Rezervare> rezervare = new ArrayList<>();
        rezervare_repo.findAll().forEach(x -> rezervare.add(x));
        return rezervare;
    }

    //GET BY ID
    public Rezervare getRezervare(Integer id)
    {
        return rezervare_repo.findById(id).get();
    }

    //POST
    public Rezervare createRezervare(@RequestBody Rezervare rezervare)
    {
        return rezervare_repo.save(rezervare);
    }
}
