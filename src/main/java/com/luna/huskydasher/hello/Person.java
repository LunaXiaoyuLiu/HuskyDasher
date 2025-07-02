package com.luna.huskydasher.hello;


public record Person(
        String name,
        String company,
        Address homeAddress,
        Book favoriteBook
) {
}

