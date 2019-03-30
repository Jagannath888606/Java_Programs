/**
* 	@purpose     : Interface to declear methods perform by addressbook  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 29-03-2019
***/

package com.bridgeit.oops.addressbook;

public interface InterfaceAddressBook 
{
	public String CreateAddressBook(String path);
	public void open(String path);
	public boolean close(String path);
	public void save(String path);
	public void saveAs(String path);
	
}

