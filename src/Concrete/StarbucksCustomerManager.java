package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws NumberFormatException, RemoteException {
		if (_customerCheckService.CheckIfRealPerson(customer))
			super.Save(customer);
		else
			System.out.println("Not a valid person");
	}

}
