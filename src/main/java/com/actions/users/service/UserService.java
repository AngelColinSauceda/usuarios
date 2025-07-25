package com.actions.users.service;

import com.actions.users.model.UserModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<UserModel> findById(String id);
    ResponseEntity<List<UserModel>> findAll();
}
