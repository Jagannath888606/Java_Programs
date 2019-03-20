/*******************************************************************************************************************
 * @purpose		:Find Distance between given two integers to origin 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Distance_Program
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter first string value:");
			String s1=Utility.getString();
			System.out.println("Enter second string value:");
			String s2=Utility.getString();
			if(s1.matches("[0-9]+") && s2.matches("[0-9]+"))//required type of data will be entered
			{
				double a=Double.parseDouble(s1);//converting string to double
				double b=Double.parseDouble(s2);//converting string to double
				double distance=Math.sqrt(a*a+b*b);
				System.out.println("distance between point(" +a+","+b+") to origin is: "+distance);
			}
			else
			{
				System.out.println("Enter valid data");
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid iuput");
		}
	}
}
