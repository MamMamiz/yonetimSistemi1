package Entities;

import Abstracts.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity{
	
	private int id ;
	private String firstName;
	private String lastName;
	private LocalDate dateofBirth;
	private String nationalityIdenty;
	
	
	public Customer () {
		
	}
	
	public Customer(int id, String firstName, String lastName, LocalDate dateofBirth, String nationalityIdenty) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalityIdenty = nationalityIdenty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public LocalDate getDateOfBirth() {
        return dateofBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateofBirth = dateOfBirth;
    }
	public String getNationalityIdenty() {
		return nationalityIdenty;
	}
	public void setNationalityIdenty(String nationalityIdenty) {
		this.nationalityIdenty = nationalityIdenty;
	}
	

	
	
	


}