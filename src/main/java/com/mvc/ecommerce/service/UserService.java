package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User saveUser(User user);
    public User findByEmail(String email);
}
