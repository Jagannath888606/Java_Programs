/*******************************************************************************************************************
 * @purpose		:Convert Decimal number to Binary number and swap the binary number and convert in decimal
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:14-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class ToBinary 
{
	public static void main(String[] args)
	{
		try  
		{
			System.out.println("Enter demical number: ");
			int dec=Utility.inputInt();
			System.out.println("Binary value of "+dec+" is: "+Utility.toBinary(dec));
			System.out.println();
			Utility.toDecimal(Utility.toBinary(dec));
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid type of iuput");
		}
	}
}