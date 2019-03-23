/****************************************************************************************************
 * 	@purpose      :  To add people to queue to withdraw or desposit money and remove them from queue
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class BankingCashCounter_Program
{
	/**
	 * @param args : it takes string array as arguments 
	 */
	public static void main(String[] args) 
	{
		System.out.print("Enter amount: ");
		int amount =Utility.inputInt();
		System.out.print("Enter number of people: ");
		// calling inputInt method from Utility package to take a value from user
		final int People = Utility.inputInt();
		Queue_Program que = new Queue_Program(People);// creating object for queue class
		/* for loop to add people name to queue*/
		for (int i = 0;i<People;i++ )
		{
			System.out.print("Enter "+i+" person name: ");
			final String Name = Utility.scanWord();
			que.enQueue(Name);// calling enQueue method to add name of person to q object
		}
		System.out.print("Queue of people is ");
		que.show();// calling show method to display list of people in queue
			
		/* for loop to enqueue or dequeue the people from queue*/
		for (int i=1;i<People;i++)
		{
			System.out.println("Welcome to bank counter");
			System.out.println("Person "+i+" please come \n");
			System.out.println("Press 1.withdraw");
			System.out.println("Press 2.deposit");
			final int Choice = Utility.inputInt(); // calling scanint method to scan integer value from user
			switch(Choice)
			{
			// case 1 to withdraw amount from bank
				case 1:
						System.out.println("Enter amount you want to withdraw");
						final int wirthDraw = Utility.inputInt();// calling inputint method to take withdraw amount from user
						// validation of withdraw amount
						if (wirthDraw>0&&wirthDraw<=amount)
						{
							amount = amount-wirthDraw;
							System.out.println("Thank you");
							if (amount == 0)
							{
								System.err.println("No cash in bank");
								return;
							}
							System.out.println(" Updated amount = "+amount);
							System.out.println("================================ \n");
						}
						else
						{
							System.err.println("Please enter valid amount");
							return;
						}
						break;
					
			// case 2 is to deposit amount to bank		
				case 2:
						System.out.println("Enter amount you want to deposit");
						final int depositAmount = Utility.inputInt();// calling inputint method to take deposit amount from user
						if(depositAmount>0)
						{
							amount = amount+depositAmount;// updating bank amount
							System.out.println("Updated amount = "+amount);
							System.out.println("================================= \n");
							break;
						}
						else
						{
							System.err.println("Please enter valid amount");
							return;
						}
				default :
							System.err.println("Please press valid button");
				return;
			}
			que.deQueue(); //calling deQueue method to remove the person from queue after their operation
			System.out.print("Current queue is ");
			que.show();
		}
	}
}
