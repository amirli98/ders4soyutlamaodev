package org.kodlamaio.service;

import org.kodlamaio.entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
