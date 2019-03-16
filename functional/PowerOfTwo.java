/*******************************************************************************************************************
 * @purpose		:To find power value of 2 till  nth time
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PowerOfTwo
{
	public static void main(String[] args)
	{
		try
		{
			int powerValue;
			System.out.println("Enter power value");
			powerValue = Utility.inputInt();
			Utility.powerOfTwo(powerValue);
		}
		catch(Exception e)
		{
			System.out.println("Enter integer as input");
		}
	}
}


