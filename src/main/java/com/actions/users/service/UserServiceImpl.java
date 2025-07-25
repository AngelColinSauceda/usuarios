package com.actions.users.service;

import com.actions.users.model.UserModel;
import com.actions.users.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    @Override
    public ResponseEntity<UserModel> findById(String id) {
        return ResponseEntity.ok(repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found")));
    }

    @Override
    public ResponseEntity<List<UserModel>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }
}
