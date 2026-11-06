package com.chhannon.b02m1restfulapi.repository;


import com.chhannon.b02m1restfulapi.dto.UserResponse;
import com.chhannon.b02m1restfulapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {
    private List<User> users;

    public UserRepository(){
     users = List.of(
             new User(UUID.randomUUID(), "kaka", "12345", "kdey kaka", true),
        new User(UUID.randomUUID(), "koka", "23456", "kdey koka", true)
     );

    }

    public List<User> selectAll(){
        return users;
    }
}
