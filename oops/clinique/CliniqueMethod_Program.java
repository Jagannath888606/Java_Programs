/**
 * @purpose	:To read the data and is used to manage a list of Doctors associated with the Clinique
 * 
 * @author	:B.Jagannath
 * @version	:1.0
 * @since   :30-03-2019
 */

package com.bridgeit.oops.clinique;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.UtilClinique_Program;

public class CliniqueMethod_Program implements Interface_Program
{

	Calendar cal = Calendar.getInstance();
	private Patients_Program patients[];
	@SuppressWarnings("unused")
	private Doctors_Program doctors[];
	private List<Patients_Program> patientList; 
	private List<Doctors_Program> doctorList;
	private List<Patients_Program> searchResultPatient;
	private List<Doctors_Program> searchResultDoctor;
	private List<Appointment_Program > appointments;

	public  CliniqueMethod_Program()
	{

		patientList=new LinkedList<Patients_Program>();
		doctorList=new LinkedList<Doctors_Program>();
		searchResultDoctor=new LinkedList<Doctors_Program>();
		searchResultPatient=new LinkedList<Patients_Program>();
		appointments=new LinkedList<Appointment_Program>();
		
	}

	ObjectMapper mapper=new ObjectMapper();
	static File filePatient=new File("/home/administrator/Documents/Clinique/Patients.json");
	static File fileDoctor=new File("/home/administrator/Documents/Clinique/Doctors.json");
	@Override
	public void addDoctor() 
	{

		try
		{

			doctors=mapper.readValue(fileDoctor,Doctors_Program[].class);
			doctorList.clear();

			for(Doctors_Program doctor:doctorList)
			{
				doctorList.add(doctor);
			}

			System.out.println("Enter the Doctor name to add list....");
			String doctorName=UtilClinique_Program.readString();

			System.out.println("Enter the Specialization of the doctor.....");
			String speciDector=UtilClinique_Program.readString();

			System.out.println("Enter the availability of the Doctor like (AM,PM or Both)....");
			String availability=UtilClinique_Program.readString();

			int appointment=5;
			int count=1;

			Doctors_Program newDoctor=new Doctors_Program(count, doctorName, speciDector, availability, appointment);
			count++;
			doctorList.add(newDoctor);


			mapper.writeValue(fileDoctor,doctorList);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Some thing went wrong please restart the program....!!!");
			System.out.println(e.getMessage());
		}

	}

	@Override
	public Patients_Program addPatient() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		Patients_Program newPatient;
		
		if(filePatient.length() == 0)
			return null;
		
			patients=mapper.readValue(filePatient, Patients_Program[].class);
			patientList.clear();
			for(Patients_Program pat:patients)
			{
				patientList.add(pat);
			}

			System.out.println("Enter the patient Name ...... ");
			String patientName=UtilClinique_Program.readString();

			System.out.println("Enter the Patient age ......");
			int patientAge=UtilClinique_Program.readInteger();

			System.out.println("Enter the patient phone number....");
			String phoneNumber=UtilClinique_Program.readString();

			int count=1;
			newPatient=new Patients_Program(count, patientName, phoneNumber, patientAge);
			count++;
			patientList.add(newPatient);

			mapper.writeValue(filePatient, patientList);
			return newPatient;
	}
		
	

	@Override
	public boolean searchPatientsId(int id)
	{
		boolean isThere=false;
		try
		{
			Patients_Program patient[]=mapper.readValue(filePatient, Patients_Program[].class);
			patientList.clear();
			searchResultPatient.clear();
			for(Patients_Program pat:patient)
			{
				searchResultPatient.add(pat);
			}
			for(int i=0;i<patient.length;i++)
			{
				for(int j=i+1;j<patient.length;j++)
				{
					if(patient[i].getId()==id)
					{
						searchResultPatient.add(patient[i]);
						isThere=true;
						System.out.println(patient[i].toString());
					}

				}

			}

		}
		catch (Exception e)
		{
			System.out.println("not found.....");
		}

		return isThere;
	}

	@Override
	public boolean searchPatientsName(String name) 
	{
		boolean isThere=false;
		try
		{
			Patients_Program patient[]=mapper.readValue(filePatient, Patients_Program[].class);
			patientList.clear();
			searchResultPatient.clear();
			for(Patients_Program pat:patient)
			{
				patientList.add(pat);
			}
			for(int i=0;i<patient.length;i++)
			{
				for(int j=i;j<patient.length;j++)
				{
					if(patient[i].getPatientsName().equals(name))
					{
						searchResultPatient.add(patient[i]);
						isThere=true;
					}
				}

			}

		}
		catch (Exception e)
		{
			System.out.println("not found.....");
		}
		return isThere;
	}

	@Override
	public boolean searchPatientsNumber(String phNumber) 
	{
		boolean isThere=false;
		searchResultPatient.clear();
		try
		{
			Patients_Program patient[]=mapper.readValue(filePatient, Patients_Program[].class);
			patientList.clear();

			for(Patients_Program pat:patient)
			{
				searchResultPatient.add(pat);
			}
			for(int i=0;i<patient.length;i++)
			{
				for(int j=i;j<patient.length;j++)
				{
					if(patient[i].getPhoneNumber().equals(phNumber))
					{
						searchResultPatient.add(patient[i]);
						isThere=true;
						System.out.println(patient[i].toString());
					}
				}

			}

		}
		catch (Exception e) 
		{
			System.out.println("not found.....");
		}
		return isThere;
	}

	@Override
	public boolean searchDoctorId(int id)
	{
		boolean isThere=false;
		try
		{
			searchResultDoctor.clear();
			Doctors_Program doctor[]=mapper.readValue(filePatient, Doctors_Program[].class);
			doctorList.clear();

			for(Doctors_Program doc:doctor)
			{
				doctorList.add(doc);
			}
			for(int i=0;i<doctor.length;i++)
			{
				for(int j=i;j<doctor.length;j++)
				{
					if(doctor[i].getId()==id)
					{
						searchResultDoctor.add(doctor[i]);
						isThere=true;
						System.out.println(doctor[i].toString());
					}

				}

			}

		}catch (Exception e) {
			System.out.println("not found.....");
		}


		return isThere;
	}

	@Override
	public boolean searchDoctorName(String name) 
	{
		boolean isThere=false;
		try
		{
			searchResultDoctor.clear();
			Doctors_Program doctor[]=mapper.readValue(fileDoctor, Doctors_Program[].class);
			doctorList.clear();

			for(Doctors_Program doc:doctor)
			{
				doctorList.add(doc);
			}
			for(int i=0;i<doctorList.size();i++)
			{
				for(int j=i;j<doctorList.size();j++)
				{
					if(doctor[i].getDoctorName().equals(name))
					{
						searchResultDoctor.add(doctor[i]);
						isThere=true;
					}

				}

			}

		}
		catch (Exception e)
		{
			System.out.println("not found.....");
		}


		return isThere;
	}

	@Override
	public boolean searchDoctorspecialization(String specilize)
	{
		
		boolean isThere=false;
		try
		{
			searchResultDoctor.clear();
			Doctors_Program doctor[]=mapper.readValue(filePatient, Doctors_Program[].class);
			doctorList.clear();

			for(Doctors_Program doc:doctor)
			{
				doctorList.add(doc);
			}
			for(int i=0;i<doctor.length;i++)
			{
				for(int j=i;j<doctor.length;j++)
				{
					if(doctor[i].getDoctorName().equals(specilize))
					{
						searchResultDoctor.add(doctor[i]);
						isThere=true;
						System.out.println(doctor[i].toString());
					}

				}

			}

		}
		catch (Exception e) 
		{
			System.out.println("not found.....");
		}


		return isThere;

	}

	@Override
	public boolean searchDoctorAvailability(String avilible )
	{
		boolean isThere=false;
		try
		{
			searchResultDoctor.clear();
			Doctors_Program doctor[]=mapper.readValue(filePatient, Doctors_Program[].class);
			doctorList.clear();

			for(Doctors_Program doc:doctor)
			{
				doctorList.add(doc);
			}
			for(int i=0;i<doctor.length;i++)
			{
				for(int j=i;j<doctor.length;j++)
				{
					if(doctor[i].getDoctorName().equals(avilible))
					{
						searchResultDoctor.add(doctor[i]);
						isThere=true;
						System.out.println(doctor[i].toString());
					}

				}

			}

		}
		catch (Exception e) 
		{
			System.out.println("not found.....");
		}
		return isThere;
	}


	public Patients_Program getPatientToBeAppoint() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("\n Is patient already taking treatment from doctor(Y/N) :");
		char ch= UtilClinique_Program.readString().charAt(0);

		if(ch=='y'||ch=='Y')
		{
			System.out.println("\n Enter name of patient to search in the list");
			String patientName =UtilClinique_Program.readString();

			searchPatientsName(patientName);

			if(searchResultPatient.size()==0 )
			{
				System.out.println("\n There is no records found for the patient");
				return null;
			}
			else if(searchResultPatient.size()>1)
			{
				System.out.println("\n There are two or more records founded \n Plzzz enter id of patient : ");

				int id=UtilClinique_Program.readInteger();

				searchPatientsId(id);

				if(searchResultPatient.size()!=0)
				{
					return ((LinkedList<Patients_Program>) searchResultPatient).getFirst();
				}
			}
			else
			{
				return ((LinkedList<Patients_Program>) searchResultPatient).getFirst();
			}
		}
		else if(ch=='n'|| ch=='N')
		{
			Patients_Program patient=addPatient();

			return patient;

		}
		return null;

	}

	@SuppressWarnings("deprecation")
	@Override
	public void getAppointment(String doctorName) 
	{
		appointments.clear();
		try
		{

			Appointment_Program appointmentList[]= mapper.readValue(new File("/home/administrator/Documents/Clinique/Appointment.json"), Appointment_Program[].class);
			boolean flag=false;
			Date date=new Date();

			for(Appointment_Program appoint:appointmentList)
			{
				if(appoint.getDoctorName().equals(doctorName))
				{
					if(appoint.getPatientList().size()<5)
					{
						Patients_Program patient=getPatientToBeAppoint();
						if(patient != null && appoint.getPatientList().getFirst().getId()==(patient.getId())==false)
						{
							appoint.getPatientList().add(patient);
							flag=true;
						}
						else
						{
							System.out.println("\n Patient is already appointed");
							return;
						}
					}
					else 
					{
						date.setDate(date.getDate()+1);
					}

				}
				appointments.add(appoint);
			}

			if(flag==false)
			{


				String dateString= date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900);

				LinkedList<Patients_Program> patientList= new LinkedList<Patients_Program>();

				patientList.add(getPatientToBeAppoint());

				Appointment_Program newAppointment=new Appointment_Program(dateString,doctorName, patientList);

				appointments.add(newAppointment);
			}
			mapper.writeValue(new File("/home/administrator/Documents/Clinique/Appointment.json"), appointments);

		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Invalid......");
		}

	}

	public void appointment() throws IOException
	{

		System.out.println("\n Which doctors appointment u did have ? : ");
		String doctorName=UtilClinique_Program.readString();

		searchDoctorName(doctorName);
		if(searchResultDoctor.size()==1)
		{
			getAppointment(doctorName);
		}	
		else if(searchResultDoctor.size()>1)
		{
			System.out.println("\n Enter Doctor Id to search :");
			int id=UtilClinique_Program.readInteger();
			searchDoctorId(id);

			if(searchResultDoctor.size()!=0)
			{
				getAppointment(doctorName);
			}
			else
			{
				System.out.println("\n No such doctor is found ");
			}
		}
		else 
		{
			System.out.println("\n The doctor u specified is not in the list");
		}

	}
	public void displayDoctorSearchResult()
	{
		searchResultDoctor.forEach(doctor->System.out.println(doctor.toString()));
	}

	public void displayPatientSearchResult()
	{
		searchResultPatient.forEach(patient->System.out.println(patient.toString()));
	}

	public void displayAppointments() throws JsonParseException, JsonMappingException, IOException
	{
		Appointment_Program appointmentList[]= mapper.readValue(new File("/home/administrator/Documents/Clinique/Appointment.json"), Appointment_Program[].class);
		System.out.println("\n ***************Appointment Details**************");
		
		for(Appointment_Program appoint: appointmentList)
		{
			System.out.print("\n Doctor Name : "+appoint.getDoctorName());
			System.out.println("\n Date : "+appoint.getDate());
			for(Patients_Program patient: appoint.getPatientList())
			{
				System.out.println(patient.toString());
			}
		}

	}
}
