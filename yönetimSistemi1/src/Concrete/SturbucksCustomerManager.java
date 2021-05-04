package Concrete;

import Abstracts.CustomerManager;


import Abstracts.ICustomerCheckServices;

import Entities.Customer;



public class SturbucksCustomerManager extends CustomerManager {
	
	private ICustomerCheckServices customerCheckService;
	public SturbucksCustomerManager (ICustomerCheckServices customerCheckService) {
		super();
		this.customerCheckService =customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer) {
		  if (customerCheckService.checkIfRealPerson(customer)) {
	            super.save(customer);
	        }else {
	            try {
	                throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
	            }
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	}
}
	
