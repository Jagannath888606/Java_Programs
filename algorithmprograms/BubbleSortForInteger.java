/*******************************************************************************************************************
 * @purpose		:BubbleSort method for Integer
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:11-03-2019
 *******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class BubbleSortForInteger
{
	public static void main(String[] args)
	{
		try 
		{
			Utility.bubbleSortForInteger();
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid integer value");
		}
	}
}
