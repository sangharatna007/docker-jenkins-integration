package com.example.dockerjenkinsintegration.controller;

import com.example.dockerjenkinsintegration.model.Address;
import com.example.dockerjenkinsintegration.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // get user by ID'
    @GetMapping("{id}")
    public Person getUserById(@PathVariable long id)
    {
      return new Person(101, "Sangha", new Address("Nanded", "MH", "India", 431602));
    }
    // Add user
    // get
}
