package com.turkcell.Abstract;

import com.turkcell.Entity.Customer;

public abstract class BaseCustomerManager implements CustomerService {


    @Override
    public  void Save(Customer customer) throws Exception {
        System.out.println("Saved To DB "+ customer.getFırstName()+" "+customer.getLastName());
    }
}
