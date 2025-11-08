package com.project.huskydasher.model;

import com.project.huskydasher.entity.MenuItemEntity;
import com.project.huskydasher.entity.OrderItemEntity;

public record OrderItemDto(
        Long orderItemId,
        Long menuItemId,
        Long restuarantId,
        Double price,
        Integer quantity,
        String menuItemName,
        String menuItemDescription,
        String menuItemImageUrl
) {
    public OrderItemDto(OrderItemEntity orderItemEntity, MenuItemEntity menuItemEntity) {
        this(
                orderItemEntity.id(),
                orderItemEntity.menuItemId(),
                menuItemEntity.restaurantId(),
                orderItemEntity.price(),
                orderItemEntity.quantity(),
                menuItemEntity.name(),
                menuItemEntity.description(),
                menuItemEntity.imageUrl()
        );
    }
}
