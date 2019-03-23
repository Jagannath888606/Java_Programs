/******************************************************************************************
 * 	@purpose      : To read a list of numbers  from  file and search for a string,if the is found,delete it,if word is not found add the number to file
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

import java.io.PrintWriter;

import com.bridgeit.utility.Utility;

public class UnOrderList_Program 
{
	public static void main(String[] args) throws Exception 
	{
		 /* @param args : it takes  string array  as command line aruguments
		 */
		final String Output;
		final String Path = "/home/administrator/Documents/unoredr.txt"; 
	
		LinkedList_Program<String> list= new LinkedList_Program<>();// creating object to linkedlist class
		PrintWriter pr = new PrintWriter("unorder.txt"); // creating a file
		
		/* reading data from br object and adding it to linkedlist*/
			String word[] = Utility.fileReadString(Path);
			
			for (int i=0;i<word.length;i++)
			{
				list.add(word[i]);
			}
			
			list.display();
		System.out.println("Enter the word you want to search in file");
		String search = Utility.scanWord(); // calling method to scan user word
		
		if (list.search(search)==true)
		{
			System.out.println("Word is found in file");
			System.out.println("Removing word from flie");
			list.delete(search); // deleting element from file
			list.display();
			Output = list.getString(); // converting list words to a string
			pr.write(Output);// writing the data to file
		}
		else
		{
			System.out.println("Word is not found in file");
			System.out.println("Adding word to file");
			list.add(search); // adding element to file
			list.display();
			Output = list.getString();// converting list words to a string
			pr.write(Output);// writing the data to file
		}
		pr.flush();
		pr.close();
	}
	
}
