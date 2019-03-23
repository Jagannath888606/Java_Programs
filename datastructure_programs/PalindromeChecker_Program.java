/****************************************************************************************************
 * 	@purpose      : To hold common method of deque
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 **************************************************************************************************/
package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class PalindromeChecker_Program 
{
	public static void main(String[] args) 
	{
		String str = "";
		System.out.println("Enter a word");
		String Word = Utility.getString();//calling getstring method to scan a word from user 
		if(Word.matches("[a-zA-Z]+"))
		{
			Deque_Program d = new Deque_Program(Word.length()); // creating object for deque class with length of word as arugumentjag	
			for (int i=0;i<Word.length();i++)
			{
				d.addRear(Word.charAt(i));// adding character to rear position of deque	
			}	
			for (int i=0;i<Word.length();i++)
			{
				str=str+d.getFront(); // getting character from front position of deque and concating with a empty string
			}
				
			if(Word.equals(str)) // condition to check string is palindrome or not
			{
				System.out.println("Word is palindrome");
			}
			else
			{
				System.out.println("Word is not palindrome");	
			}
		}
		else
		{
			System.out.println("Enter valid data ...........");
		}
	}
}
