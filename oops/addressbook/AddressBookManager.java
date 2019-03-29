package com.bridgeit.oops.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookManager implements InterfaceAddressBook
{
	private static String location="/home/administrator/Documents/AddressBook/";
	ObjectMapper mapper= new ObjectMapper();
	@Override
	public String CreateAddressBook(String path)
	{
		String str="fails to create";
		File file=new File(location+path+".json");
		if(file.exists())
		str="already exist.. add different name...";
		try
		{
			@SuppressWarnings({ "unused", "resource" })
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			return str;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		return str;
	}

	@Override
	public void open(String path) 
	{
		AddressBook address=new AddressBook();
		File file=new File(location+path+".json");
		if(file.exists())
		{
			String name=location+path+".json";
			address.displayAll();
			try
			{
				address.openAddressBook(name);
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
	}

	@Override
	public boolean close(String path)
	{
		boolean isDelete=false;
		File f=new File(location+path+".json");
		if(f.exists())
		{
			f.delete();
			isDelete=true;
		}
		return isDelete;
	}

	@Override
	public void save(String path) 
	{
		File newFile= Utility.getFile(location+path+".json");
		LinkedList<Person> listPerson=new LinkedList<>();
		try
		{
			Person list[]=mapper.readValue(newFile,Person[].class);
			for(Person per:list)
			{
				listPerson.add(per);
			}
			
		}catch (Exception e) 
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}

	@Override
	public void saveAs(String path) {
	
		File file=Utility.getFile(location+path+".json");
		LinkedList<Person>listPerson=new LinkedList<>();
		
		try 
		{
			Person list[]=mapper.readValue(file,Person[].class);
			for(Person per:list)
			{
				listPerson.add(per);
			}
			BufferedWriter bw=new BufferedWriter(new FileWriter(location+path+".txt"));
			for(Person p:listPerson)
			{
				bw.write(p.toString());
			}
			bw.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

}

}

