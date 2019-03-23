/******************************************************************************************
 * 	@purpose      : To print prime  numbers between 1-1000 in a 2D array,1-100 first row,100-200 second row and so on
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 22-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class PrimeNumbers2D_Program 
{
	public static void main(String[] args) 
	{		 
			final int r=9;// intilizing rows
			final int n=100;// intilizing coloums
			int num=0;
			int next=100;
			// creating arraylist object to store prime  numbers
			ArrayList <String> arr = new ArrayList<String>();
			arr = Utility.primeNumbers(1000);// calling prime method to get all prime numbers between 1-1000
			final int size = arr.size();
			final String array[] = new String [size];
			final	int prime [] = new int [size];
			final int prime_Arr[][] = new int[11][100];
			/*loop to store elements in a string array*/
			for (int i=0;i<array.length;i++)
			{
				array[i] = arr.get(i);
				System.out.print(array[i]+" ");
			}
			/*loop to convert string array to integer array */
			for (int i=0;i<array.length;i++)
			{
				prime [i] = Integer.parseInt(array[i]);
			}
				
			/* outer for loop is for rows and inner for loop is for coloums and store corresponding values*/
			for (int i=0;i<=r;i++)
			{
				for (int j=0;j<n;j++)
				{
					if(prime[num]<next)//condtion to store prime numbers in a manner
					{
						prime_Arr[i][j] = prime[num];
						num++;
					}	
				}
				System.out.println();
				next=next+100;
			}
			/*outer for loop to display rows and inner for loop to display coloums*/
			for (int i=0;i<r+1;i++)
			{
				for (int j=0;j<n;j++)
				{
					if(prime_Arr[i][j]==0)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(prime_Arr[i][j]+"  ");
					}
				}
				System.out.println();
			}
	}
}
