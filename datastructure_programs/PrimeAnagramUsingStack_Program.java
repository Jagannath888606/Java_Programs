/****************************************************************************************************
 * 	@purpose      : To print prime anagram numbers in a queue order using stack which is implemented using linkedlist 
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 16-01-2019
 ******************************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagramUsingStack_Program
{
	/**
	 * @param args : it takes string array as command line arguments 
	 */
	public static void main(String[] args) 
	{
		// creating object to stackusinglinkedlist class to store elements
		StackUsingLinkedList_Program<Integer> sll = new StackUsingLinkedList_Program<Integer>();
		// storing primeanagram elements in a array 
		final int prime_Anagram[] =Utility.convertToIntegerArray();
		/* for loop to push elements to object */
		for (int i=0;i<prime_Anagram.length;i++)
		{
			// caling method to push elements
			sll.push(prime_Anagram[i]);
		}
		// method to display elements in object
		sll.display();
	}
}
