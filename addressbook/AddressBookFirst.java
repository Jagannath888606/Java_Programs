/**
* 	@purpose     : main method to start address book application  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 2-03-2019
***/

package com.bridgeit.oops.addressbook;

import java.util.Scanner;

public class AddressBookFirst 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		AddressBookManager manager=new AddressBookManager();
		Controller controller=new Controller();
		String choice;
		String fileName=null;
		while (true)
		{
			do {
				System.out.println("enter 1 to create address book :  ");
				System.out.println("enter 2 to open address book :  ");
				System.out.println("enter 3 to close address book :  ");
				System.out.println("enter 4 to save address book :  ");
				System.out.println("enter 5 to saveAs address book :  ");
				choice=scan.next();
			}while(choice.isEmpty()||choice.length()>1||(Integer.parseInt(choice)>=6));

			int ch=Integer.parseInt(choice);
			String name=null;
			switch(ch)
			{
			case 1 : System.out.println(" the file name to create the address book : ");
			name=scan.next();
			manager.CreateAddressBook(name);
			break;

			case 2: controller.loadAddressBook();
			System.out.println("enter the which address book to open.... : ");
			fileName = scan.next();

			manager.open(fileName);
			break;

			case 3:manager.close(fileName);
			System.out.println("the address book closed.....!!");
			break;

			case 4:System.out.println("your data as been saved....seccussfully!!!!");
			break;

			case 5:manager.saveAs(fileName);
			System.out.println("your data as been saved to the text file....!!");
			break;

			default: System.out.println("enter the valid choice...."); 
			}

		}
	}
}
