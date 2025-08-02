package com.actions.users.repository;

import com.actions.users.model.UserModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<UserModel,String> {
 Optional<UserModel> findByEmail(String email);
}
