package Entites;

import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {

	public int Id;
	public String FirstName;
	public String LastName;
	public LocalDate dateOfBirth;
	public Long NationalityId;

	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, Long nationalityId) {
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

}
