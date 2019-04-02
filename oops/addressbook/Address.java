/**
*  @purpose     :  To hold address details and there getter and setter methods to get and set values  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 29-03-2019
***/

package com.bridgeit.oops.addressbook;

public class Address 
{

	private String locality;
	private String city;
	private String state;
	private String zip;

	public Address()
	{

	}

	public Address(String locality, String city, String state, String zip) 
	{
		super();
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() 
	{
		return "Address [locality=" + locality + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	public String getLocality()
	{
		return locality;
	}

	public void setLocality(String locality)
	{
		this.locality = locality;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZip() 
	{
		return zip;
	}

	public void setZip(String zip) 
	{
		this.zip = zip;
	}
}
