package com.mvc.ecommerce.repository;

import com.mvc.ecommerce.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    public User saveUser( User user);
}
