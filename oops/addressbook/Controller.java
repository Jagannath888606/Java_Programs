/**
 * @purpose		: To return the data into address book
 * 
 * @author 		: B.Jagannath
 * @version		: 1.0
 * @since		: 29-03-2019
 */

package com.bridgeit.oops.addressbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Controller 
{
	public List<String> loadAddressBook()
	{
		File f=new File(".");
		File[] filesList = f.listFiles();
		List <String>addressBook=new ArrayList<>();
		for(File file:filesList)
		{
			if(file.isDirectory())
			addressBook.add(file.toString());
			return new ArrayList<String>(addressBook);
		}

		return null;
	}
}
