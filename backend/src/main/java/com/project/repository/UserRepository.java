package com.project.repository;

import com.project.model.User;

public interface UserRepository {

    User createUser(User user);

    User getOne(int id);

}