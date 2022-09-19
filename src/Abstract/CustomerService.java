package Abstract;

import java.rmi.RemoteException;

import Entites.Customer;

public interface CustomerService {
	void Save(Customer customer) throws NumberFormatException, RemoteException;
}
