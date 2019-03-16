/*******************************************************************************************************************
 * @purpose		:To find the numbers whose sum is equal to zero
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class SumOfThree_Integers 
{
	public static void sumcount(int n) 
	{
		int[] arr = new int[n];
		int count = 0;
		System.out.println("Enter "+n+" elements: ");
		for (int i=0;i<n;i++) 
		{
			arr[i] = Utility.inputInt();
		}
		for (int i=0;i < arr.length;i++) 
		{
			for (int j=i + 1;j< arr.length;j++) 
			{
				for (int k=j + 1;k< arr.length;k++) 
				{
					if (arr[i]+arr[j] +arr[k]== 0) 
					{
						count++;
						System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
					}
				}
			}
		}
		System.out.println("Total pairs are "+ count);
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter number of elements: ");
			int n = Utility.inputInt();
			sumcount(n);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid input ");
		}
	}
}

















