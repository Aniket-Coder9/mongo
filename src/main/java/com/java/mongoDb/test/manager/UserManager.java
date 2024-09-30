package com.java.mongoDb.test.manager;

import com.java.mongoDb.test.entity.User;
import com.java.mongoDb.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class UserManager {

    private final UserRepository userRepository;

    public void saveUser(User request) {
        userRepository.save(request);
    }

    public List<User> getAllUser() {
      return userRepository.findAll();
    }
}
