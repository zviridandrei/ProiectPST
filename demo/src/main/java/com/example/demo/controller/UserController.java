package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.UsersService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UsersService usersService;

    @Autowired
    public UserController (UsersService usersService)
    {
        this.usersService=usersService;
    }

    //GET
    @GetMapping
    public List<User> getAllUsers(){
        return usersService.getAllUsers();
    }

    //GET dupa ID
    @GetMapping("/{id}")
    public User getAllUsersbyId(@PathVariable("id") Integer id)
    {
        return usersService.getUsers(id);
    }

    //POST
    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return usersService.createUser(user);
    }

    //PUT
    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return usersService.updateUser(id,user);
    }

    //PATCH
    @PatchMapping("/{id}")
    public User updatePatchUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return usersService.updatePatchUser(id,user);
    }

    //DELETE
    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable("id") Integer id)
    {
        usersService.DeleteUser(id);
    }
}