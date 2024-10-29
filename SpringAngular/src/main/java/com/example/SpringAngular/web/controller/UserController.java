package com.example.SpringAngular.web.controller;

import com.example.SpringAngular.persistence.model.Userr;
import com.example.SpringAngular.persistence.repository.UserrRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserrRepository userrRepository;

    public UserController(UserrRepository userrRepository) {
        this.userrRepository = userrRepository;
    }

    @GetMapping("/users")
    public List<Userr> getUsers(){
        return (List<Userr>) userrRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody Userr user){
        userrRepository.save(user);
    }
}
