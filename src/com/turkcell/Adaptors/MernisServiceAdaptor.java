package com.turkcell.Adaptors;

import com.turkcell.Abstract.CustomerCheckService;
import com.turkcell.Entity.Customer;
import com.turkcell.Mernis.TWFKPSPublicSoap;


public class MernisServiceAdaptor implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        TWFKPSPublicSoap Mernis = new TWFKPSPublicSoap();

        return Mernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFırstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear()+1900 );
    }
}
