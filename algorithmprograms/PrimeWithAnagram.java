/*******************************************************************************************************************
 * @purpose		:To find the prime numbers that are Anagram
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:11-03-2019
 *******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class PrimeWithAnagram
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("The anagram numbers in between 1-1000 prime numbers are:"+Utility.anagramPrime());
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid input data");
		}
	}
}
