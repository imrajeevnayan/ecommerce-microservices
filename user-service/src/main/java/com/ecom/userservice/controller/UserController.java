package com.ecom.userservice.controller;

import com.ecom.userservice.model.User;
import com.ecom.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public List<User>getAllusers(){
        return userRepository.findAll();
    }
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user){
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User>getUserByid(@PathVariable Long id){
        return userRepository.findById(id).map(user -> ResponseEntity.ok(user))
                .orElse(ResponseEntity.notFound().build());
    }



}
