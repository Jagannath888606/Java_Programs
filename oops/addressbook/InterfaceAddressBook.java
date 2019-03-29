package com.bridgeit.oops.addressbook;

public interface InterfaceAddressBook 
{
	public String CreateAddressBook(String path);
	public void open(String path);
	public boolean close(String path);
	public void save(String path);
	public void saveAs(String path);
	
}

