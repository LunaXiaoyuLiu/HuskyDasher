package com.project.huskydasher.controller;

import com.project.huskydasher.entity.CustomerEntity;
import com.project.huskydasher.model.AddToCartBody;
import com.project.huskydasher.model.CartDto;
import com.project.huskydasher.service.CartService;
import com.project.huskydasher.service.CustomerService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private final CartService cartService;
    private final CustomerService customerService;

    public CartController(
            CartService cartService,
            CustomerService customerService
    ) {
        this.cartService = cartService;
        this.customerService = customerService;
    }

    @GetMapping("/cart")
    public CartDto getCart(@AuthenticationPrincipal User user) {
        CustomerEntity customer = customerService.getCustomerByEmail(user.getUsername());
        return cartService.getCart(customer.id());
    }

    @PostMapping("/cart")
    public void addToCart(@AuthenticationPrincipal User user, @RequestBody AddToCartBody body) {
        CustomerEntity customer = customerService.getCustomerByEmail(user.getUsername());
        cartService.addMenuItemToCart(customer.id(), body.menuId());
    }

    @PostMapping("/cart/checkout")
    public void checkout(@AuthenticationPrincipal User user) {
        CustomerEntity customer = customerService.getCustomerByEmail(user.getUsername());
        cartService.clearCart(customer.id());
    }

}

