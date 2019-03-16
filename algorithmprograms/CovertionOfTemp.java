/*******************************************************************************************************************
 * @purpose		:Temperature Conversion 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:13-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class CovertionOfTemp 
{
	public static void main(String[] args) 
	{
		try
		{
			Utility.temperatureConvertion();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid type data");
		}
	}

}
