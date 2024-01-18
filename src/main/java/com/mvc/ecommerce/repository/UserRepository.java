package com.mvc.ecommerce.repository;

import com.mvc.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< User, Long> {

    public User findByEmail(String email);

    //public User saveUser( User user);
}
