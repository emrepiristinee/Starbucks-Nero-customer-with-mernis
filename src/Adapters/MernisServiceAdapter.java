package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(customer.NationalityId, customer.FirstName, customer.LastName, customer.dateOfBirth.getYear());
	}

}
