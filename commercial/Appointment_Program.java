/**
 * @purpose	:
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.commercial;

import java.util.LinkedList;

public class Appointment_Program 
{
	private String date;
	private String doctorName;
	//private LinkedList<Doctors>doctorList;
	private LinkedList<Patients_Program>patientList;
	
	public Appointment_Program() 
	{
		
	}
	public String getDate() 
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public LinkedList<Patients_Program> getPatientList() 
	{
		return patientList;
	}
	public void setPatientList(LinkedList<Patients_Program> patientList) 
	{
		this.patientList = patientList;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName)
	{
		this.doctorName = doctorName;
	}
	
	@Override
	public String toString()
	{
		return "Appointment [date=" + date + ", doctorName=" + doctorName + ", patientList=" + patientList + "]";
	}
	public Appointment_Program(String date, String doctorName, LinkedList<Patients_Program> patientList) 
	{
		super();
		this.date = date;
		this.doctorName = doctorName;
		this.patientList = patientList;
	}
}
