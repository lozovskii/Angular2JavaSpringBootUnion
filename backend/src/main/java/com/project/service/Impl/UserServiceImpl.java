package com.project.service.Impl;

import com.project.model.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.createUser(user);
    }

    @Override
    public User getOne(int id) {
        return this.userRepository.getOne(id);
    }
}