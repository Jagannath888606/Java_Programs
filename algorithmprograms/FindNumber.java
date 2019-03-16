/*******************************************************************************************************************
 * @purpose		: Find your number by using Binary Search method
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:12-03-2019
 ******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class FindNumber
{
	public static double range()
	{
		System.out.println("Enter range of number: ");
		double range=Utility.getDouble();
		range=Math.pow(2.0,range);
		return range;
	}
	public static void main(String[] args) 
	{
		try 
		{
			int array[]=new int[(int)range()];
			for(int i=0;i<array.length;i++)
			{
				array[i]=i;
			}
			System.out.println("pick a random number: ");
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]+" ");
			}
			System.out.println("\n");
			int startPiont = 0;
			int endPoint = array.length;
			
			while(startPiont<endPoint)
			{
				int mid = startPiont+(endPoint-startPiont)/2;
				System.out.println("if your number is "+array[mid]+" press 0 \n");
				System.out.println("if your number is greater than "+array[mid]+" press 1 \n");
				System.out.println("if your number is lesser than "+array[mid]+" press 2 \n");
				int choice=Utility.inputInt();
				switch (choice)
				{
					case 0:
							System.out.println("guessed number is "+array[mid]);
							System.exit(0);
							break;
					
					case 1:
							startPiont=mid+1;
							break;
					
					case 2:
							endPoint = mid-1;
							break;
					
					default:
							System.out.println("cheating");
				}
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
	}

}
