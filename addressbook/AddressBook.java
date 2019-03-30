package com.bridgeit.oops.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class AddressBook 
{
	private static ObjectMapper mapper;
	private static File file;
	private List<Person> addressEntry; 
	Scanner scan= new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	
	public AddressBook()
	{
		
	}
	
	public AddressBook(String fileName)
	{
		mapper=new ObjectMapper();		//used to convert Json content to Java object 
		file=new File(fileName);
		addressEntry=new LinkedList<Person>();
	}
	
	/**
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void addNewEntry() throws JsonParseException, JsonMappingException, IOException
	{
		Person oldBook[]=mapper.readValue(file, Person[].class);// to read the value from the json file
		addressEntry.clear();
		for(Person book:oldBook)		//reading one one element from the json file 
		{
			addressEntry.add(book);
		}
		
		System.out.println("Enter the details : ");
		System.out.println("FirstName : ");
		String firstName=scan.next();
		
		System.out.println("Enter the LastName : ");
		String lastName=scan.next();
		
		System.out.println("Enter the Address details : ");
		System.out.println(" Locality : ");
		String locality=scan.next();
		
		System.out.println(" City : ");
		String city=scan.next();
		
		System.out.println(" State : ");
		String state=scan.next();
		
		System.out.println(" ZipCode : ");
		String zip=scan.next();
		
		System.out.println(" Contact Number : ");
		String contact=scan.next();
		
		Address newAddress=new Address(locality, city, state, zip);	// assigning the address
		ArrayList<Address> addressList=new ArrayList<>();
		addressList.add(newAddress);
		Person newPerson=new Person(firstName, lastName, contact, addressList);// assigning the person name and all
		addressEntry.add(newPerson);
		try
		{
			mapper.writeValue(file, addressEntry);		// writing to the java object 
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	
	public void edit(String firstName,String lastName) throws JsonParseException, JsonMappingException, IOException
	{
		addressEntry.clear();
		Person oldBook[]=mapper.readValue(file, Person[].class);
		for(Person book: oldBook)
		{
			if((book.getFirstName().equals(firstName))&&(book.getLastName().equals(lastName)))
			{
				System.out.println("Enter the which one to edit (address or contactnumber) : ");
				String value=scan1.next();
				
				if(value.equals("address"))
				{
					System.out.println("Enter the Address details : ");
					System.out.println(" Locality : ");
					String locality=scan1.next();
					
					System.out.println(" City : ");
					String city=scan1.next();
					
					System.out.println(" State : ");
					String state=scan1.next();
					
					System.out.println(" ZipCode : ");
					String zip=scan1.next();
					

					Address newAddress=new Address(locality, city, state, zip);
					ArrayList<Address> addressList=new ArrayList<>();
					addressList.add(newAddress);
					book.setAddress(addressList);
					
				}
				else if(value.equals("contact"))
				{
					System.out.println("Enter the contact number : ");
					String num=scan1.next();
					
					book.setcontact(num);
					
				}
			}
			addressEntry.add(book);
		}
		try
		{
			mapper.writeValue(file, addressEntry);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void delete(String firstName,String lastName) throws JsonParseException, JsonMappingException, IOException
	{
		Person oldBook[]=mapper.readValue(file,Person[].class);
		addressEntry.clear();
		for(Person book:oldBook)
		{
			if((book.getFirstName().equals(firstName))&&(book.getLastName().equals(lastName)))
				continue;
			addressEntry.add(book);
		}
		mapper.writeValue(file, addressEntry);	
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * 
	 */
	public boolean search(String firstName,String lastName) throws JsonParseException, JsonMappingException, IOException
	{
		Person oldBook[]=mapper.readValue(file,Person[].class);
		boolean isThere=false;
		//addressEntry.clear();
		for(Person book:oldBook)
		{
			if((book.getFirstName().equals(firstName))&&(book.getLastName().equals(lastName)))
				isThere=true;
		}
		return isThere;	
	}
	/**
	 * @throws IOException 	Signals that an I/O exception of some sort has occurred
	 * @throws JsonMappingException Signal fatal problem with mapping of contents
	 * @throws JsonParseException Exception type for parsing problems, used when non-well-formed content 
	 * 
	 */
	public void sortByLastName() throws JsonParseException, JsonMappingException, IOException
	{
		Person oldBook[]=mapper.readValue(file,Person[].class);
		addressEntry.clear();
		for(int i=0;i<oldBook.length;i++)
		{
			for(int j=i+1;j<oldBook.length;j++)
			{
				String str1=oldBook[i].getFirstName()+oldBook[i].getLastName();
				String str2=oldBook[j].getFirstName()+oldBook[j].getLastName();
				
				if(str1.compareTo(str2)>0)	// for sorting 
				{
					Person temp;
					temp=oldBook[i];
					oldBook[i]=oldBook[j];
					oldBook[j]=temp;
				}
			}
		}
		for(Person book:oldBook)
			addressEntry.add(book);
		mapper.writeValue(file, addressEntry);	
	}
	
	/**
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 * 
	 */
	public void sortByZip() throws JsonParseException, JsonMappingException, IOException
	{
		Person oldBook[]=mapper.readValue(file,Person[].class);
		addressEntry.clear();
		for(int i=0;i<oldBook.length;i++)
		{
			for(int j=i+1;j<oldBook.length;j++)
			{
				String str1=oldBook[i].getAddress().get(0).getZip();
				String str2=oldBook[j].getAddress().get(0).getZip();
				
				if(str1.compareTo(str2)>0)	// for sorting 
				{
					Person temp;
					temp=oldBook[i];
					oldBook[i]=oldBook[j];
					oldBook[j]=temp;
				}
			}
		}
		for(Person book:oldBook)
			addressEntry.add(book);
		mapper.writeValue(file, addressEntry);	
	}
	/**
	 * in this method displaying the address book from json file to console 
	 */
	public void displayAll()
	{
		try
		{
			Person oldBook[]=mapper.readValue(file,Person[].class);
			for(Person book:oldBook)
			{
				System.out.println("Name : "+book.getFirstName());
				System.out.println("LastName : "+book.getLastName());
				System.out.println("Contact Number : "+book.getcontact());
				System.out.println("Address : "+book.getAddress().toString());
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	//public static void main (String[] args);
	public void openAddressBook(String filename) throws JsonParseException, JsonMappingException, IOException 
	{
		AddressBook newBook=new AddressBook(filename);
		System.out.println(".........Address book consits of following details..........");
		String choice;
		
			do {
				System.out.println("Enter 1 to add the data to the address book..");
				System.out.println("Enter 2 to edit the file in the address book....");
				System.out.println("Enter 3 to delete the content in the address book...");
				System.out.println("Enter 4 to search the data in the address book...");
				System.out.println("Enter 5 to sort the data in the address book by last name...");
				System.out.println("Enter 6 to sort the data in the address book by zip values...");
				System.out.println("Enter 7 to display the address book...");
				System.out.println("Enter 8 to exit from the program");
				choice=scan1.next();
			}while(choice.isEmpty()||choice.length()>1||(Integer.parseInt(choice)>=8));	//validating the number

			int ch=Integer.parseInt(choice);

			String firstName,lastName;
			switch(ch)
			{
			case 1: newBook.addNewEntry();
			//newBook.displayAll();
			break;

			case 2: System.out.println("Enter the FirstName to edit the list");
			firstName=scan.next();
			System.out.println("Enter the LastName... ");
			lastName=scan.next();

			newBook.edit(firstName, lastName);
			//newBook.displayAll();
			break;

			case 3: System.out.println("Enter the FirstName to edit the list");
			firstName=scan.next();
			System.out.println("Enter the LastName... ");
			lastName=scan.next();

			newBook.delete(firstName, lastName);
			//newBook.displayAll();
			break;
			case 4: System.out.println("Enter the FirstName to edit the list");
			firstName=scan.next();
			System.out.println("Enter the LastName... ");
			lastName=scan.next();

			newBook.search(firstName, lastName);
			//newBook.displayAll();
			break;

			case 5:System.out.println();
			newBook.sortByLastName();

			//newBook.displayAll();
			break;

			case 6:	System.out.println();
			newBook.sortByZip();

			//newBook.displayAll();
			break;

			case 7: System.out.println();
			newBook.displayAll();
			break;

			case 8: System.out.println("you are exit from the Address Book....");

			return;
			}
			
}
}
