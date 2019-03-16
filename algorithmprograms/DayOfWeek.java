/*******************************************************************************************************************
 * @purpose		:To find Day Of Week 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:13-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter date in day / month / year manner: ");
			int day=Utility.inputInt();
			int month=Utility.inputInt();
			int year=Utility.inputInt();
			Utility.dayOfWeek(day, month, year);
		}
		
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid type integer value");
		}
	}
}
