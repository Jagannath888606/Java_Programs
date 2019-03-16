/*******************************************************************************************************************
 * @purpose		:By using Static Functions to generate Random number and to process Distinct Coupons
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Coupon_Numbers 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter maximum length");
			int length = Utility.inputInt();
			System.out.println("Coupon number = "+Utility.getRandomInteger(length));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid data: ");
		}
	}
}
