package com.example.kvizko.repository;

import com.example.kvizko.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPasswordAttr(String username, String password);
    User findByUsername(String username);
}
