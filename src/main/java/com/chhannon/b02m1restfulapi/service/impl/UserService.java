package com.chhannon.b02m1restfulapi.service.impl;

import com.chhannon.b02m1restfulapi.dto.UserCreateRequest;
import com.chhannon.b02m1restfulapi.dto.UserResponse;
import com.chhannon.b02m1restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserResponse create(UserCreateRequest userCreateRequest);

    List<UserResponse> getAll();

    User getById(UUID id);

    void deleteById(UUID id);
}