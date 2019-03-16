/*******************************************************************************************************************
 * @purpose		:To create a 2D array which takes integer double and boolean values
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class TwoD_Array
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("Enter 1 for integer array");
			System.out.println("Enter 2 for double array");
			System.out.println("Enter 3 for boolean array");
			int choice = Utility.inputInt();
			switch (choice)
			{
				case 1:
						System.out.println("Enter rows of array");
						int rows = Utility.inputInt();
						System.out.println("Enter coloums of array");
						int coloums = Utility.inputInt();
						int arr[][] = new int[rows][coloums];
						System.out.println("Enter your array");
						for (int i=0;i<arr.length;i++)
						{
							for (int j=0;j<arr.length;j++)
							{
								arr[i][j] = Utility.inputInt();
							}
						}
						for (int i=0;i<arr.length;i++)
						{
							for (int j=0;j<arr.length;j++)
							{
								System.out.print(arr[i][j]+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
				case 2:
						System.out.println("Enter rows of array");
						int rowd = Utility.inputInt();
						System.out.println("Enter coloums of array");
						int coloumd = Utility.inputInt();
						
						double arrd[][] = new double[rowd][coloumd];
						System.out.println("Enter your array");
						for (int i=0;i<arrd.length;i++)
						{
							for (int j=0;j<arrd.length;j++)
							{
								arrd[i][j] = Utility.getDouble();
							}
						}
						for (int i=0;i<arrd.length;i++)
						{
							for (int j=0;j<arrd.length;j++)
							{
								System.out.print(arrd[i][j]+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					
				case 3:
						System.out.println("Enter rows of array: ");
						int rowb = Utility.inputInt();
						System.out.println("Enter coloums of array: ");
						int coloumb = Utility.inputInt();
						
						boolean arrb[][] = new boolean[rowb][coloumb];
						System.out.println("Enter your array");
						for (int i=0;i<arrb.length;i++)
						{
							for (int j=0;j<arrb.length;j++)
							{
								arrb[i][j] = Utility.getBoolean();
							}
						}
						for (int i=0;i<arrb.length;i++)
						{
							for (int j=0;j<arrb.length;j++)
							{
								System.out.print(arrb[i][j]+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Invalid data is entered");
		}
	}
}