package com.project.huskydasher.model;

public record RegisterBody(
        String email,
        String password,
        String firstName,
        String lastName
) {
}

