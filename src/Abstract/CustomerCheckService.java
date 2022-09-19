package Abstract;

import java.rmi.RemoteException;

import Entites.Customer;

public interface CustomerCheckService {
	Boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
