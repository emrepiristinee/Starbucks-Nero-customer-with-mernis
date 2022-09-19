import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entites.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager
				.Save(new Customer(1, "Emre", "Piriþtine", LocalDate.of(2000, 9, 11), Long.parseLong("11111111111")));
	}

}
