/****************************************************************************************************
 * 	@purpose      : To print prime anagram numbers in a queue order using Queue which is implemented using linkedlist 
 * 
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 23-03-2019
 ******************************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagramUsingQueue_Program
{
	/**
	 * @param args : it takes string array as command line arguments 
	 */
	public static void main(String[] args) 
	{ 
		//creating object for queueusinglinkedlist class
		QueueUsingLinkedList_Program<Integer> list = new QueueUsingLinkedList_Program<Integer>();
		// calling method to store all prime numbers in an array
		final int prime[] = Utility.convertToIntegerArray();
		/*for loop to add all prime numbers to object*/
		for (int i=0;i<prime.length;i++)
		{
			list.insert(prime[i]); // calling method to insert prime elements in to object
		}
		list.display(); // calling method to display elements in object
	}
}
