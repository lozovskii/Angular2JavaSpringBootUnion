package com.project.controller;

import com.project.model.User;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/registr")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    ResponseEntity<User> registr(@RequestBody User user)throws IOException {
        User user1 = userService.createUser(user);
        System.out.println(user1);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

//    @GetMapping
//    ResponseEntity<List<User>> getAllUsers() {
//        List<User> users = userService.getOne();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

}
