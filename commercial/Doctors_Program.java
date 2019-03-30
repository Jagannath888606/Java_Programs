/**
 * @purpose	:
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.commercial;

import java.util.Comparator;

public class Doctors_Program implements Comparator<Doctors_Program>
{
	private int id;
	private String doctorName;
	private String specialization;
	private String availability;
	private int noOfPatients;
	
	public Doctors_Program()
	{
		
	}

	public Doctors_Program(int id, String doctorName, String specialization, String availability, int noOfPatients) 
	{
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.availability = availability;
		this.noOfPatients = noOfPatients;
	}

	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getDoctorName() 
	{
		return doctorName;
	}
	public void setDoctorName(String doctorName) 
	{
		this.doctorName = doctorName;
	}
	public String getSpecialization() 
	{
		return specialization;
	}
	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}
	public String getAvailability()
	{
		return availability;
	}
	public void setAvailability(String availability)
	{
		this.availability = availability;
	}
	public int getNoOfPatients()
	{
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) 
	{
		this.noOfPatients = noOfPatients;
	}
	

	@Override
	public String toString()
	{
		return "Doctors [id=" + id + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", availability=" + availability + ", noOfPatients=" + noOfPatients + "]";
	}


	@Override
	public int compare(Doctors_Program arg0, Doctors_Program arg1) 
	{
		
		return 0;
	}
}
