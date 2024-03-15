package com.turkcell;

import com.turkcell.Abstract.BaseCustomerManager;
import com.turkcell.Adaptors.MernisServiceAdaptor;
import com.turkcell.Concrete.NeroCustomerManager;
import com.turkcell.Concrete.StarbucksCustomerManager;
import com.turkcell.Entity.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager =new NeroCustomerManager(new MernisServiceAdaptor());

        customerManager.Save(new Customer(1,"Mehmet","Göksu", new Date(101, 6, 4),"11111111111"));
        //Mernis Api si çalışmaktadır.


    }
}
