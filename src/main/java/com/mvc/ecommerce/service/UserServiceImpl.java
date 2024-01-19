package com.mvc.ecommerce.service;

import com.mvc.ecommerce.entity.User;
import com.mvc.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{



    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        User theUser = userRepository.save(user);
        return theUser;
    }

    @Override
    public User findByEmail(String email) {
        User theUser = userRepository.findByEmail(email);
        return theUser;
    }

    @Override
    public void updateUserByEmail(String email, User user) {
        User theUser = userRepository.findByEmail(email);
        theUser.setFirstName(user.getFirstName());
        theUser.setLastName(user.getLastName());
        theUser.setRole(user.getRole());

        userRepository.save(theUser);
    }

    public void deleteUserById(Long Id){
        userRepository.deleteById(Id);
    }
}
