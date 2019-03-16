/*******************************************************************************************************************
 * @purpose		: By using static function sqrt  to compute the square root of a non negative number
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:14-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class SquareRootOfNon 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter the value to find square root:  ");
			double c=Utility.getDouble();
			System.out.println("Square root of a non negative number is: "+Utility.squareRootOfNon(c));
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
	}
}
