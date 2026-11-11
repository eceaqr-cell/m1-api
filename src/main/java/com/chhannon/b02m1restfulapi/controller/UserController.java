package com.chhannon.b02m1restfulapi.controller;


import com.chhannon.b02m1restfulapi.dto.UserCreateRequest;
import com.chhannon.b02m1restfulapi.dto.UserResponse;
import com.chhannon.b02m1restfulapi.model.User;
import com.chhannon.b02m1restfulapi.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;




@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        userService.deleteById(id);
    }


    @ResponseStatus(HttpStatus.CREATED) // customize response status code
    @PostMapping
    public UserResponse create(@RequestBody UserCreateRequest userCreateRequest) {
        return userService.create(userCreateRequest);
    }


    @GetMapping
    public List<UserResponse> getAll() {
        return userService.getAll();
    }

}