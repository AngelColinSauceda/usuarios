package com.actions.users.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.actions.users.model.UserModel;

@DataJpaTest
public class UserRepostioryTest {
    
    @Autowired
    private UserRepository repository;

    @Test
    public void findByIdTest(){
     UserModel user = new UserModel(null, "Angel", "Colin", "angel.antoni48@gmail.com");
     UserModel userSave = repository.save(user);

     String idGenerado = userSave.getId();

     var userFindById = repository.findById(idGenerado);
     
     assertTrue(userFindById.isPresent());
     assertEquals("Angel", userFindById.get().getName());
    }
    
    @Test
    public void findByEmailTest(){
        UserModel user = new UserModel(null, "Angel", "Colin", "angel.antoni48@gmail.com");
        UserModel userSave = repository.save(user);

        assertEquals("angel.antoni48@gmail.com", userSave.getEmail());
    }
}