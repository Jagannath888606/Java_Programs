/*******************************************************************************************************************
 * @purpose		: To find the prime factors of a given number
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PrimeFactorization
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter number to find prime factors");
			int number=Utility.inputInt();
			System.out.print("Prime factors of "+number+" is: ");
			for(int i=2;i<=number;i++)			
			{
				while(number%i==0)
				{
					System.out.print(i+" ");
					number=number/i;
				}
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid data: ");
		}
	}
}
