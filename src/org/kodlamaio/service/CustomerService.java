package org.kodlamaio.service;

import org.kodlamaio.entities.Customer;

public interface CustomerService {
    default void save(Customer customer){
        System.out.println("Saved to database "+customer.getFirstName());
    };
}
