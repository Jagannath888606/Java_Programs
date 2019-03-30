/**
 * @purpose	:
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.commercial;

import java.util.Comparator;

public class Patients_Program implements Comparator<Patients_Program>
{
	private int id;
	private String patientsName;
	private String phoneNumber;
	private int age;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getPatientsName() 
	{
		return patientsName;
	}
	public void setPatientsName(String patientsName)
	{
		this.patientsName = patientsName;
	}
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public Patients_Program()
	
	{
		
	}
	public Patients_Program(int id, String patientsName, String phoneNumber, int age) 
	{
		super();
		this.id = id;
		this.patientsName = patientsName;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Patients [id=" + id + ", patientsName=" + patientsName + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ "]";
	}
	@Override
	public int compare(Patients_Program arg0, Patients_Program arg1) 
	{
		
		return this.id=arg1.id;
	}
}
