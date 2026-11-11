package com.chhannon.b02m1restfulapi.dto;

public record UserCreateRequest(
        String username,
        String password,
        String fullName
) {
}
