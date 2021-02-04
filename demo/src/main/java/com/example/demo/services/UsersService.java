package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repo.User_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    private final User_repo users_repo;

    @Autowired
    public UsersService (User_repo users_repo)
    {
        this.users_repo=users_repo;
    }


    //Metoda GET
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<>();
        users_repo.findAll().forEach(x -> users.add(x));
        return users;
    }

    //Metoda GetById
    public User getUsers(Integer id)
    {
        return users_repo.findById(id).get();
    }

    //PostMapping - Crearea unei resurse user
    public User createUser(@RequestBody User user)
    {
        return users_repo.save(user);
    }

    //PutMapping - modificarea completa a resursei dupa id
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        user.setId(id);
        return users_repo.save(user);
    }

    //PatchMapping - modificarea partiala a resursei
    public User updatePatchUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        User newUser = users_repo.findById(id).get();
        user.setId(id);
        if(user.getEmail() != null)
        {
            newUser.setEmail(user.getEmail());
        }
        if(user.getParola() != null)
        {
            newUser.setParola(user.getParola());
        }

        return users_repo.save(newUser);
    }
    //DELETE by ID
    public void DeleteUser(@PathVariable("id") Integer id)
    {
        users_repo.deleteById(id);
    }
}