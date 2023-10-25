package com.kci.jwt.controller;

import com.kci.jwt.entity.Users;
import com.kci.jwt.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers(){
        userService.initRolesAndUsers();
    }

    @PostMapping({"/registerNewUser"})
    public Users registerNewUser(@RequestBody Users user){

        return userService.registerNewUser(user);
    }

    @GetMapping({"forAdmin"})
    public String forAdmin(){
        return "this url is only accessible to admin";
    }
    @GetMapping({"forUser"})
    public String forUser(){
        return "this url is only accessible to user";
    }

}
