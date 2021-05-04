package Abstracts;

import Entities.Customer;

public abstract class CustomerManager implements ICustomerServices{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database :"+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
