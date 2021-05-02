package org.kodlamaio;

import org.kodlamaio.concrete.NeroCustomerManager;
import org.kodlamaio.concrete.StarBucksCustomerManager;
import org.kodlamaio.entities.Customer;
import org.kodlamaio.service.BaseCustomerManager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Fazil", "Amirli", new Date(), "99373456991");
        BaseCustomerManager customerManager1 = new NeroCustomerManager();
        Customer customer2 = new Customer();
        customer2.setNationalId("9934356334");
        customer2.setFirstName("Engin");
        StarBucksCustomerManager customerManager2 = new StarBucksCustomerManager();
        customerManager2.save(customer2);
        customerManager1.save(customer1);

    }
}
