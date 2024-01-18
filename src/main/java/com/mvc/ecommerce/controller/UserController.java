package com.mvc.ecommerce.controller;

import com.mvc.ecommerce.entity.User;
import com.mvc.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService userService;

    //constructor injection

//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user ){

        User theUser = userService.saveUser(user);
        return theUser;
    }

       //read a user
    @GetMapping("/getUser/{email}")
    public User getUser(@PathVariable String email){
        User theUser = userService.findByEmail(email);
        return theUser;
    }
}
