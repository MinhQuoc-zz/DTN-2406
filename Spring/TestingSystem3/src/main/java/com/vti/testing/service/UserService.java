package com.vti.testing.service;

import com.vti.testing.entity.User;
import com.vti.testing.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;


    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
