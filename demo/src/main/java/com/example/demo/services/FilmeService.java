package com.example.demo.services;

import com.example.demo.model.Filme;
import com.example.demo.repo.Filme_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService {

    private Filme_repo filme_repo;

    @Autowired
    public FilmeService ( Filme_repo filme_repo )
    {
        this.filme_repo = filme_repo;
    }

    //GET
    public List<Filme> getAllFilme()
    {
        List<Filme> rezervare = new ArrayList<>();
        filme_repo.findAll().forEach(x -> rezervare.add(x));
        return rezervare;
    }

    //GET BY ID
    public Filme getFilme(Integer id)
    {
        return filme_repo.findById(id).get();
    }

    //POST
    public Filme createFilme(@RequestBody Filme rezervare)
    {
        return filme_repo.save(rezervare);
    }
}
