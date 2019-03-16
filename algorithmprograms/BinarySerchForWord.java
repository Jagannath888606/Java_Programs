/*******************************************************************************************************************
 * @purpose		:BinarySearch method for search the word from word list
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:12-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class BinarySerchForWord 
{
	public static void main(String[] args)  
	{
		
			System.out.println("Enter the word you want to search in the file: ");
			String searchWord = Utility.getString();
			if(searchWord.matches("[a-zA-Z]+"))
			{
			if (Utility.binarySearchFile(searchWord)==true)
			{
				System.out.println("word is found");		
			}
			else
			{
				System.out.println("word is not found");
			}
		}
		else
		{
			System.out.println(" invalid arguments ");
		}
		
	}
}
