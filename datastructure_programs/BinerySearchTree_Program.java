/****************************************************************************************************
 * 	@purpose      : To find number of posibilities of a given number 
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 22-03-2019
 ******************************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class BinerySearchTree_Program 
{
	/**
	 * @param args : It take string array as command line arguments
	 * @formula	   : (2*n)!(n+1)!n!
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter number between 1-10 to find number of combinations");
		// calling method from utility to take a number from user
		final long Number=Utility.inputInt();
		if(Number>0 && Number<=10)
		{
			// calling the factorial  method to find factorial of (2*n)!
			final long Numarator=Utility.factorial(2*Number);
			// calling the factorial  method to find factorial of (n)!
			final long Denomarator=Utility.factorial(Number);
			// calling the factorial  method to find factorial of (n+1)!
			final long Denomarator1=Utility.factorial(Number+1);
			System.out.println("Total number of combinations of "+Number+" = "+Numarator/(Denomarator1*Denomarator));
		}
		else
		{
			System.out.println("Enter the number with in range ");
		}
	}
}
