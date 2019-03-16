/*******************************************************************************************************************
 * @purpose		: To find the nth Harmonic number and print it
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Hormonic_Number 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter Nth Hormonic number: ");
			int num=Utility.inputInt();
			float sum=0;
			for(int i=1;i<=num;i++)
			{
				sum=sum+(float)1/i;
			}
			System.out.println("Value of Nth Harmonic number is: "+ sum);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid data ");
		}
	}
}
