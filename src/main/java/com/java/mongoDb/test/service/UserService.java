package com.java.mongoDb.test.service;

import com.java.mongoDb.test.entity.User;
import com.java.mongoDb.test.manager.UserManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserManager userManager;

    public String saveUser(User request) {
        userManager.saveUser(request);
        return "success";
    }

    public List<User> getAllUser() {
        return userManager.getAllUser();
    }
}
