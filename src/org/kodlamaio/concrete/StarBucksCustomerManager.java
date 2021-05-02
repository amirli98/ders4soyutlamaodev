package org.kodlamaio.concrete;

import org.kodlamaio.entities.Customer;
import org.kodlamaio.service.BaseCustomerManager;
import org.kodlamaio.service.CustomerCheckService;



public class StarBucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService checkService;

    public StarBucksCustomerManager()
    {
        this.checkService = customer -> customer.getNationalId().startsWith("993");
    }
    @Override
    public void save(Customer customer) {
        if(checkService.checkIfRealPerson(customer)){
            super.save(customer);
        }
    }


}
