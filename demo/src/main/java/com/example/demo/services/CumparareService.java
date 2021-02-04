package com.example.demo.services;

import com.example.demo.model.Cumparare;
import com.example.demo.repo.Cumparare_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CumparareService {

    private Cumparare_repo cumparare_repo;

    @Autowired
    public CumparareService ( Cumparare_repo cumparare_repo )
    {
        this.cumparare_repo = cumparare_repo;
    }

    //GET
    public List<Cumparare> getAllCumparare()
    {
        List<Cumparare> rezervare = new ArrayList<>();
        cumparare_repo.findAll().forEach(x -> rezervare.add(x));
        return rezervare;
    }

    //GET BY ID
    public Cumparare getCumparare(Integer id)
    {
        return cumparare_repo.findById(id).get();
    }

    //POST
    public Cumparare createCumparare(@RequestBody Cumparare rezervare)
    {
        return cumparare_repo.save(rezervare);
    }
}
