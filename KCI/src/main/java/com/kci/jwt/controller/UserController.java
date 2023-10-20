package com.kci.jwt.controller;

import com.kci.jwt.entity.User;
import com.kci.jwt.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @PostConstruct
//    public void initRolesAndUsers(){
//        userService.initRolesAndUsers();
//    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){

        return userService.registerNewUser(user);
    }
}
