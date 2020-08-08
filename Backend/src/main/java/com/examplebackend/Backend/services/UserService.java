package com.examplebackend.Backend.services;

import com.examplebackend.Backend.domain.User;
import com.examplebackend.Backend.exceptions.UsernameAlreadyExistsException;
import com.examplebackend.Backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser (User newUser) {

        try {
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));

            // Username must be unique (Exception)
            newUser.setUsername(newUser.getUsername());

            return userRepository.save(newUser);
        }catch (Exception e) {
            throw new UsernameAlreadyExistsException("Username " + newUser.getUsername() + " already exists.");
        }
    }
}
