/**
 * @purpose	:
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.commercial;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Interface_Program
{
	public void addDoctor();
	public Patients_Program addPatient() throws JsonGenerationException, JsonMappingException, IOException;
	public boolean searchPatientsId(int id);
	public boolean searchPatientsName(String name);
	public boolean searchPatientsNumber(String phNumber);
	public boolean searchDoctorId(int id);
	public boolean searchDoctorName(String name);
	public boolean searchDoctorspecialization(String speclize);
	public boolean searchDoctorAvailability(String avilible);
	public void getAppointment(String doctorName);
}
