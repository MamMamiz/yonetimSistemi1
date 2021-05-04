package Main;
 
import java.time.LocalDate;

import Abstracts.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;
public class Main {

	
		
		
		public static void main(String[] args) {
			Customer customer1 = new Customer(1,"Muhammet","Çakýr",LocalDate.of(2000,7,6), "15803248965");
			CustomerManager neroCustomerManager = new NeroCustomerManager();
			neroCustomerManager.save(customer1);
			
			CustomerManager starbucksCustomerManager = new SturbucksCustomerManager(new MernisServiceAdapter());
			starbucksCustomerManager.save(customer1);

		}


}
