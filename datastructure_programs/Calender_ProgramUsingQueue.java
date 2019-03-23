/****************************************************************************************************
 * 	@purpose      : To print calender of given month and year using queue
 * 
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 *******************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class Calender_ProgramUsingQueue
{
	public static void main(String[] args) 
	{
		//Creating main object for Queue using linkedlist class  
		QueueUsingLinkedList_Program<QueueUsingLinkedList_Program<Integer>> queue = new QueueUsingLinkedList_Program<QueueUsingLinkedList_Program<Integer>>();
		//Creating sub  object for Queue using linkedlist class to store week days  
		QueueUsingLinkedList_Program<Integer> queue1 = new QueueUsingLinkedList_Program<Integer>();
		System.out.println("Enter month");
		// Calling method to take month from user
		final int Month = Utility.inputInt();
		System.out.println("Enter year");
		// Calling method to take year from user
		final int Year = Utility.inputInt();
		//Validating year and month 
		if ((Month<=12&&Month>=1)&&(Year>=1000&&Year<=9999))
		{
			//Calling getday method to find the starting day of month
			final int Start_Day = Utility.getDay(Month, Year);
			// Storing number of days containing in each month
			final int Month_Arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			System.out.println("Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thus"+"\t"+"Fri"+"\t"+"Sat");
			// Condition for checking year is a leap year or not
			if(Year%4==0 && Year%100!= 0 || Year%400==0)	
			{
				Month_Arr[1]=29;
			}
			/*This i for to store days to sub queues and storing sub queues in main queue*/
			for (int i = 1; i <= Month_Arr[Month-1]; i++) 
			{
				queue1.insert(i);//calling insert method to insert elements in to object
				//Condition to create new sub queue
				if (((i + Start_Day)%7 == 0 || i==Month_Arr[Month-1]) ) 
				{
					queue.insert(queue1);// Inserting subqueue to main queue 
					queue1=new QueueUsingLinkedList_Program<Integer>(); // Creating new sub queue
               }
			
			}
			/*For to print space where there is no day falls*/
			for (int i=0;i<Start_Day;i++)
			{
				System.out.print("\t");
			}
			/*For loop to print all subqueues in main queue*/
			for (int i=0;i<queue.size();i++)
			{
				//Removing top queue from main queue and coping it to variable
				QueueUsingLinkedList_Program<Integer> week= queue.remove();
				//For loop to print elements in sub queue
				for (int j=0;j<week.size();j++)
				{
					//rinting sub object elements
					System.out.print(week.remove()+"\t");
				}
				System.out.println();
			}
		}
		else
		{
			System.err.println("Please enter valid month and year");
		}
	
	}
}
