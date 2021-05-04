package Concrete;

import Abstracts.ICustomerCheckServices;


import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckServices{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
