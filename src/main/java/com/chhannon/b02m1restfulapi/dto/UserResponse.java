package com.chhannon.b02m1restfulapi.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String fullName,
        Boolean isActive
) {
}