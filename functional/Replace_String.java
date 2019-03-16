/*******************************************************************************************************************
 * @purpose		:To replace the string with the user given string
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Replace_String 
{
	public static void main(String[] args) 
	{
			String orgString = "Hello <<username>>, How are you ?";
			System.out.println("Original string = "+orgString);
			System.out.print("Enter Username-->");
			String userInput = Utility.getString();
			if(userInput.matches("[a-zA-Z]+"))//required data will be enter
			{
				if(userInput.length()<=3)
				{
					System.out.println("Please enter minimum 3 characters");
				}
				else
				{
					System.out.println("ReplacedString = "+orgString.replace("<<username>>",userInput));
				}	
			}
			else
			{
				System.out.println("Enter valid data");
			}
					
	}
}
