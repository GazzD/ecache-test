package com.ironhack.demo5.service;

import com.ironhack.demo5.model.User;
import com.ironhack.demo5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "userList")
    public List<User> findAll() throws InterruptedException {
        Thread.sleep(3000);
        return userRepository.findAll();
    }

}
