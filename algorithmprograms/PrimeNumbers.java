/*******************************************************************************************************************
 * @purpose		:Print prime numbers in between 1-1000 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:11-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(Utility.primeNumbers(1000));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid input data");
		}
	}
}
