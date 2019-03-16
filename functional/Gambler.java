/*******************************************************************************************************************
 * @purpose		:To find the wheather the person win or draw in gambler game 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Gambler
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Enter stak value: ");
			int stake  = Utility.inputInt(); 
			System.out.println("Enter goal value: ");
	        int goal   = Utility.inputInt(); 
	        System.out.println("Enter number of trials: ");
	        int trials = Utility.inputInt();     
	        int bets = 0;        
	        int wins = 0;       
	        for (int t=0;t<trials;t++) 
	        {
	            int cash=stake;
	            while (cash >0 && cash< goal)
	            {
	                bets++;
	                if (Math.random() < 0.5)
	                {
	                	cash++;     
	                }
	                else
	                {
	                	cash--;     
	                }
	            }
	            if(cash==goal) 
	            {
	            	wins++;              
	            }
	        }
			System.out.println(wins+" wins out of "+trials);
	        System.out.println("Percent of game won: "+ 100.0 * wins / trials);
	        System.out.println("Avg # bet: "+ 1.0 * bets / trials);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid data ");
		}
		
	}
}
