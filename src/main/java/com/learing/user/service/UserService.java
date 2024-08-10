package com.learing.user.service;

import com.learing.user.dto.UserEntity;
import com.learing.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }

    public Optional<UserEntity> getUserByID(UUID userID) {
        Optional<UserEntity> user;
        if (userRepository.findById(userID).isPresent()) {
            user = userRepository.findById(userID);
        } else {
            throw new RuntimeException("User is not present");
        }
        return user;
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
