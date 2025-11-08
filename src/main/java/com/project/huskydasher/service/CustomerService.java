package com.project.huskydasher.service;

import com.project.huskydasher.entity.CustomerEntity;
import com.project.huskydasher.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }
}
