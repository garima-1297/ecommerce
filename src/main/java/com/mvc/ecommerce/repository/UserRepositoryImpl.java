package com.mvc.ecommerce.repository;

import com.mvc.ecommerce.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    //Entity manger
    @Autowired
    private EntityManager entityManager;
    //entity manager constructor


    public UserRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public User saveUser(User user) {

        entityManager.persist(user);
        return user;
    }
}
