package com.project.huskydasher.model;

import com.project.huskydasher.entity.CartEntity;
import com.project.huskydasher.entity.OrderItemEntity;

import java.util.List;

public record CartDto(
        Long id,
        Double totalPrice,
        List<OrderItemDto> orderItemEntities
) {
    public CartDto(CartEntity entity, List<OrderItemDto> orderItems) {
        this(entity.id(), entity.totalPrice(), orderItems);
    }
}
