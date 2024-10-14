package com.example.diplom.service;

import com.example.diplom.model.User;
import com.example.diplom.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private User findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
