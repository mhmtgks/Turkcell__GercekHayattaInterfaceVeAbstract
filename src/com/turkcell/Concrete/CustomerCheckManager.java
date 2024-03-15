package com.turkcell.Concrete;

import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Abstract.CustomerService;
import com.turkcell.Entity.Customer;
import com.turkcell.Mernis.TWFKPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        TWFKPSPublicSoap Mernis= new TWFKPSPublicSoap();

        return true;
    }
}
