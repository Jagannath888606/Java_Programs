/*******************************************************************************************************************
 * @purpose		: By using  Static Function to calculate monthly Payment
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:13-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter principle: ");
			double principle=Utility.getDouble();
			System.out.println("Enter rate: ");
			double rate=Utility.getDouble();
			System.out.println("Enter year: ");
			double year=Utility.inputInt();
			System.out.println("Monthlypayment is "+Utility.monthlyPayment(principle, year, rate));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
	}
}
