package com.luna.huskydasher.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Person sayHello() {
        return new Person(
                "John Doe",
                "Laioffer",
                new Address("123 Main St", "Springfield", "IL", "USA"),
                new Book("Effective Java", "Joshua Bloch")
        );
    }
}


