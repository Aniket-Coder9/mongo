package com.java.mongoDb.test.controller;

import com.java.mongoDb.common.response.Response;
import com.java.mongoDb.test.entity.User;
import com.java.mongoDb.test.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("")
    public ResponseEntity<Response<String>> saveComplaint(@RequestBody User request){
        return ResponseEntity.ok(new Response<>(service.saveUser(request)));
    }

    @GetMapping("")
    public ResponseEntity<Response<List<User>>> getAllUser(){
        return ResponseEntity.ok(new Response<>(service.getAllUser()));
    }
}
