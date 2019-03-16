/*******************************************************************************************************************
 * @purpose		:Flip Coin and print percentage of Heads and Tails 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Flip_Coin 
{
	public static void main(String[] args)
	{
		try
		{
			double head=0.0;
			double tail=0.0;
			System.out.println("Enter numbers of times coins has to flip");		
			int flips = Utility.inputInt();
			for(int l=1;l<flips;l++)
			{
				if(flips>0)
				{	
					double d = Math.random();// used to generate random number between 0-1
					if (d<0.5)
					{	
						tail++;
					}
					else
					{
						head++;
					}
				}
				else
				{
					System.out.println("please enter a positive value");
				}
			}
			tail = tail/flips*100;//converting to percentage of tails
			head = head/flips*100;//converting to percentge of heads 
			System.out.println("head percentage "+head+"%" );
			System.out.println("tail percentage "+tail+"%");
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid data ");
		}
	}
}

		



