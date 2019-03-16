/*******************************************************************************************************************
 * @purpose		:To find coolness of the wind for given temperatue and speed
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class WindChill_Program
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter the outside temperature in Fahrenheit: ");
			double temp=Utility.getDouble();
			System.out.println("Enter the wind speed in miles per hour: ");
			double speed = Utility.getDouble();
			double windChill= 35.74+0.6215*temp+(0.4275*temp+35.75)*Math.pow(speed, 0.16);
			System.out.println("windChill= "+windChill);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Entered input is wrong");
		}
	}
}
