/*******************************************************************************************************************
 * @purpose		: To find roots of a given equation
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/
package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Quadratic_Program
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter 'a','b','c' values: ");
			int a=Utility.inputInt();
			int b=Utility.inputInt();
			int c=Utility.inputInt();
			double temp = (b*b-4*a*c);
			System.out.println(temp);
			double root1 =(-b+Math.sqrt(temp))/(2*a);
		    double root2 =(-b-Math.sqrt(temp))/(2*a);
		    System.out.println("The roots of the Quadratic Equation are: "+root1+" and "+root2);
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
    }
}


			