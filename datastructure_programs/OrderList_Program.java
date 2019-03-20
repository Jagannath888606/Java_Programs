/******************************************************************************************
 * 	@purpose      :  To read a list of numbers  from  file and search for a number,if the is found,delete it,if word is not found add the number to file
 *  
 *  @author       : B.Jagannth
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

import java.io.PrintWriter;
import java.util.Arrays;

import com.bridgeit.utility.Utility;

public class OrderList_Program 
{
	public static void main(String[] args) throws Exception 
	
	{
		final String output;
		final String Path="/home/administrator/Documents/order.txt";	
		LinkedList_Program<Integer> list = new LinkedList_Program<Integer>(); // creating object for linkedlist class
		PrintWriter pr = new PrintWriter("order.txt"); // creating a file
		
		int number[] = Utility.fileReadInt(Path); // calling method to store element in an array
		Arrays.sort(number);
		/* adding numbers to linkedlist*/
		for (int i =0;i<number.length;i++ )
		{
			list.add(number[i]);
		}
		list.display(); // calling method to display the elements in object
		
		System.out.println("Enter the Number you want to search in file");
		final int Search = Utility.inputInt(); // calling method to scan user word
		if (list.search(Search)==true) // calling search method to check condition
		{
			System.out.println("Number is found in file");
			System.out.println("Removing Number from flie");
			
			list.delete(Search); // deleting the word
			list.display();// display element
			output = list.getString(); //calling method to store elements in a single variable 
			pr.write(output);// writing data to file	
		}
		else
		{
			System.out.println("Number is not found in file");
			System.out.println("Adding Number to file");
			list.add(Search);// adding element to object
			list.display();
			output = list.getString();// converting list words to a string
			pr.write(output);// writing the data to file
		}
		pr.flush();
		pr.close();

	}

}
