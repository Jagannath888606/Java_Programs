/*******************************************************************************************************************
 * @purpose		: To find wheather the given year is leap year or not
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Leap_year
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter string value: ");
			String s1=Utility.getString();
			int year =Integer.parseInt(s1);//changing to integer type of value
			if(s1.length()==4)
			{
				if(year%4==0 && year%400==0 )
					
				{
					System.out.println(year+" is a leap year");
				}
				else
				{
					System.out.println(year+" is not a leap year");
				}
			}
			else
			{
				System.out.println("Enter valid number");
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter valid number");
		}
		
	}
}
