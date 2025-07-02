package com.luna.huskydasher.repository;

import com.luna.huskydasher.entity.RestaurantEntity;
import org.springframework.data.repository.ListCrudRepository;


public interface RestaurantRepository extends ListCrudRepository<RestaurantEntity, Long> {
}

