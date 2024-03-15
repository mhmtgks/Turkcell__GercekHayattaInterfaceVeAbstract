package com.turkcell.Concrete;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Entity.Customer;

import java.sql.SQLOutput;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerCheckService {

    private CustomerCheckService _CustomerCheckService;

    public NeroCustomerManager(CustomerCheckService _CustomerCheckService) {
        this._CustomerCheckService = _CustomerCheckService;
    }

    @Override
    public void Save(Customer customer) throws Exception {
       if(_CustomerCheckService.CheckIfRealPerson(customer)){
           System.out.println("Valid Person");
           super.Save(customer);
       }else{

           System.out.println("Not Valid Person");
       }


    }
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        return false;
    }
}
