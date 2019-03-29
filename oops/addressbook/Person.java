package com.bridgeit.oops.addressbook;

import java.util.ArrayList;

public class Person
{
	private String firstName;
	private String lastName;
	private String contact;
	private ArrayList<Address> address;
	
	public Person()	//no argument constructor
	{
		
	}

	public Person(String firstName, String lastName, String contact, ArrayList<Address> address) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.address = address;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getcontact() {
		return contact;
	}

	public void setcontact(String contact) {
		this.contact = contact;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", address="
				+ address + "]";
}
}
