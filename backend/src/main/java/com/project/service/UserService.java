package com.project.service;

import com.project.model.User;

public interface UserService {

    User createUser(User user);

    User getOne(int id);

}
