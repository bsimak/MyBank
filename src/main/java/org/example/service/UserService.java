package org.example.service;

import org.example.model.User;
import java.util.UUID;

public class UserService {

    public User findById(String id, String name, String password) {
        String randomId = UUID.randomUUID().toString();
        String randomPassword = UUID.randomUUID().toString();
        // always "finds" the password, every user has a random password
        return new User(randomId, name, randomPassword);
    }
}
