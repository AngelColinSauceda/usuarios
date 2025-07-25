package com.actions.users.controller;

import com.actions.users.model.UserModel;
import com.actions.users.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/find/{id}")
    public ResponseEntity<UserModel> findById(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/find/all")
    public ResponseEntity<List<UserModel>> findAll(){
        return service.findAll();
    }
}
