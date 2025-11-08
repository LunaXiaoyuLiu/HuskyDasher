package com.project.huskydasher.repository;

import com.project.huskydasher.entity.RestaurantEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface RestaurantRepository extends ListCrudRepository<RestaurantEntity, Long> {
}

