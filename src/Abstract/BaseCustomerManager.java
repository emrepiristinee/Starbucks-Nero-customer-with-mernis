package Abstract;

import java.rmi.RemoteException;

import Entites.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Saved to db: " + customer.FirstName);
	}

}
