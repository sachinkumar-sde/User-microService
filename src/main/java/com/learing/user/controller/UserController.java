package com.learing.user.controller;

import com.learing.user.dto.UserEntity;
import com.learing.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserEntity>> geUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<UserEntity>> getUser(@RequestParam(value="userId") UUID userID) {
        return new ResponseEntity<>(userService.getUserByID(userID), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
        return new ResponseEntity<>(userService.createUser(userEntity), HttpStatus.CREATED);
    }
}
