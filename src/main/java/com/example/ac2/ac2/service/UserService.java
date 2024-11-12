package com.example.ac2.ac2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2.ac2.dto.UserDTO;
import com.example.ac2.ac2.entity.User;
import com.example.ac2.ac2.entity.User_Email;
import com.example.ac2.ac2.repository.User_Repository;

@Service
public class UserService {

    @Autowired
    private static  User_Repository userRepository;

    public User createUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getName());
        user.setEmail(new User_Email(userDTO.getEmail()));
        return userRepository.save(user);
    }

    public static  List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> {
                    UserDTO dto = new UserDTO();
                    dto.setName(user.getUsername());
                    dto.setEmail(user.getEmail().getEmailAddress());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}