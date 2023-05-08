package com.devsuperior.devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.devsuperior.devsuperior.entites.Users;
import com.devsuperior.devsuperior.repositors.UserRepository;

@RestController
@RequestMapping(value ="/users")
public class UserController {

    @Autowired // pra n precisar instanciar as coisas
    private UserRepository repository;

    @GetMapping
    public List<Users> findAll(){
        List<Users> result = repository.findAll(); 
        return result;
    }    

    @GetMapping(value = "/{id}")
    public Users findById(@PathVariable Long id){
        Users result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Users insert(@RequestBody Users user){

        Users result = repository.save(user);
        return result;
    }
}
