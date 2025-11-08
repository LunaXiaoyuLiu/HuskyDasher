package com.project.huskydasher.hello;

public record Person(
        String name,
        String company,
        Address homeAddress,
        Book favoriteBook
) {
}
