/******************************************************************************************
 * 	@purpose      : To print prime anagram numbers between 1-1000 in a 2D array,1-100 first row,100-200 second row and so on
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 23-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class PrimeWithAnagram_Program 
{
	/**
	 * @param args : It takes string array as command line aruguments
	 */
	public static void main(String[] args) 
	{
		int next=100;
		final int r=9;// intilizing rows
		final int c=100;// intilizing coloums
		final int primeArr[][] =new int [r][c];
		// calling method to store all prime numbers in an array
		final int prime [] =Utility.convertToIntegerArray();
		int num=0;
		/* outer for loop is for rows and inner for loop is for coloums and store corresponding values*/
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				if (prime[num]<next)//condtion to store prime anagrams in a manner
				{
					primeArr[i][j] = prime[num];
					num++;
				}			
			}
			System.out.println();
			next=next+100;
		}
	/*outer for loop represents rows and inner for loop represents coloums*/			
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if (primeArr[i][j]==0)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print(primeArr[i][j]+"  ");
				}
			}
			System.out.println();
		}
    }
}
