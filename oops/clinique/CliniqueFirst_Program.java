/**
 * @purpose	:To write data and adding data to  json file 
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.clinique;

import java.io.IOException;

import com.bridgeit.utility.UtilClinique_Program;

public class CliniqueFirst_Program 
{
	public static void main(String[] args) throws IOException 
	{
		
		
		CliniqueMethod_Program clinique=new CliniqueMethod_Program();
		while(true)
		{
			System.out.println("\n ************Clinique Management***************");
			System.out.print ("\n \t 1. Add Doctor "
							 + "\n \t 2. Add Patient "
							 + "\n \t 3. Get Appointment "
							 + "\n \t 4. Display Appointment "
			    			 + "\n \t 5. Search Doctor "
			    			 + "\n \t 6. Search patient "
			    			 + "\n \t 7. Exit "
			    			 + "\n Choose your option............. : ");
		
			int ch= Integer.parseInt(UtilClinique_Program.readString());
			
			switch(ch)
			{
			case 1: clinique.addDoctor();
					break;
					
			case 2: clinique.addPatient();
					break;
					
			case 3: clinique.appointment();
					break;
					
			case 4: clinique.displayAppointments();
					break;
					
			case 5: System.out.println("\n 1. Search by Name "
									 + "\n 2. Search By id "
									 + "\n 3. Search by specialization "
									 + "\n 4. Search By Availability"
									 + "\n Choose your option.............. : ");
					int search= Integer.parseInt(UtilClinique_Program.readString());
					
					switch(search)
					{
					case 1: System.out.println("\n Enter name of the doctor : ");
							String name=UtilClinique_Program.readString();
							clinique.searchDoctorName(name);
							clinique.displayDoctorSearchResult();
							break;
					
					case 2: System.out.println("\n Enter Id of the doctor : "); 
							int id=UtilClinique_Program.readInteger();
							clinique.searchDoctorId(id);
							clinique.displayDoctorSearchResult();
							break;
							
					case 3: System.out.println("\n Enter Specialization of the doctor : ");
							String specializedIn=UtilClinique_Program.readString();
							clinique.searchDoctorspecialization(specializedIn);
							clinique.displayDoctorSearchResult();
							break;
							
					case 4: System.out.println("\n Enter what time should be doctor is available : ");
							String availableTime=UtilClinique_Program.readString();
							clinique.searchDoctorAvailability(availableTime);;
							clinique.displayDoctorSearchResult();
							break;
					}
					break;
					
			case 6: System.out.println("\n 1. Search by Name "
					 + "\n 2. Search By id "
					 + "\n 3. Search by mobile number "
					 + "\n Choose your option.............. : ");
				
					int searchPatient= Integer.parseInt(UtilClinique_Program.readString());
					
					switch(searchPatient)
					{
					case 1: System.out.println("\n Enter name of the patient : ");
							String name=UtilClinique_Program.readString();
							clinique.searchPatientsName(name);
							clinique.displayPatientSearchResult();
							break;
					
					case 2: System.out.println("\n Enter Id of the patient : "); 
							int id=UtilClinique_Program.readInteger();
							clinique.searchPatientsId(id);
							clinique.displayPatientSearchResult();
							break;
							
					case 3: System.out.println("\n Enter Mobile Number of the patient : ");
							String mobileNumber=UtilClinique_Program.readString();
							clinique.searchDoctorspecialization(mobileNumber);;
							clinique.displayPatientSearchResult();
							break;
							
					}
					break;
					
			case 7: return;
				
			}
		}
	}

}
