package com.actions.users.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.actions.users.model.UserModel;
import com.actions.users.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    
    @Mock
    private UserRepository repository;
    @InjectMocks
    private UserServiceImpl service;

    @Test
    public void testFindById_returnsResponseEntityUserModel(){
    UserModel user = new UserModel("213", "Angel", "Colin", "angel@gmail.com");
    when(repository.findById("213")).thenReturn(Optional.of(user));

    var result = service.findById("213");

    assertEquals("213", result.getBody().getId());
    assertEquals("Colin", result.getBody().getLastname());
    assertEquals("angel@gmail.com", result.getBody().getEmail());

    }
}
