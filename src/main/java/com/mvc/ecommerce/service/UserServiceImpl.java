package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.User;
import com.mvc.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        User theUser = userRepository.saveUser(user);
        return theUser;
    }
}
