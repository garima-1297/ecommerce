package com.mvc.ecommerce.repository;

import com.mvc.ecommerce.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public class UserRepositoryImpl implements UserRepository {

    //Entity manger
    private EntityManager entityManager;
    //entity manager constructor


    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void saveUser(User user) {

        entityManager.persist(user);
    }
}
