package com.turkcell.Abstract;

import com.turkcell.Entity.Customer;

public interface CustomerCheckService {
     boolean CheckIfRealPerson(Customer customer) throws Exception;


}
