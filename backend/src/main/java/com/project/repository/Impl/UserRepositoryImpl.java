package com.project.repository.Impl;

import com.project.model.User;
import com.project.repository.UserRepository;

import org.springframework.stereotype.Repository;
import javax.persistence.*;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User createUser(User user) {
        this.entityManager.persist(user);
        this.entityManager.flush();
        return user;
    }

    @Override
    public User getOne(int id) {
        return this.entityManager.find(User.class, id);
    }

}
