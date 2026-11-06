package com.chhannon.b02m1restfulapi.controller;


import com.chhannon.b02m1restfulapi.dto.UserResponse;
import com.chhannon.b02m1restfulapi.model.User;
import com.chhannon.b02m1restfulapi.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
 public class UserController {
    private final UserService userService;


    @GetMapping

    public List<UserResponse> getAll() {
        return userService.getAll();
    }
}