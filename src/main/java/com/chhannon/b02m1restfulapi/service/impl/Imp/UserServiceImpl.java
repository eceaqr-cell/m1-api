package com.chhannon.b02m1restfulapi.service.impl.Imp;


import com.chhannon.b02m1restfulapi.controller.UserController;
import com.chhannon.b02m1restfulapi.repository.UserRepository;
import com.chhannon.b02m1restfulapi.dto.UserResponse;

import com.chhannon.b02m1restfulapi.model.User;
import com.chhannon.b02m1restfulapi.repository.UserRepository;
import com.chhannon.b02m1restfulapi.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserResponse> getAll() {
        return userRepository.selectAll()
                .stream()
                .map(
                        user -> new UserResponse(user.getId(),
                                user.getIsActive()))
                .toList();
    }

    @Override
    public User getById(UUID id) {
        return null;
    }
}

