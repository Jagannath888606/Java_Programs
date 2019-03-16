/*******************************************************************************************************************
 * @purpose		:To find all permutations of a string
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PermutationOfString 
{
	public static void permutations(char[] ch, int k)
	{	
		if (k==ch.length)
		{
			for (int i = 0; i < ch.length; i++)
			{
				System.out.println(ch[i]);	
			}
			System.out.println();
		}
		else
		{
			for(int i=k;i<ch.length;i++)
			{
				char temp = ch[k];
				ch[k] = ch[i];
				ch[i] = temp;
				permutations(ch, k+1);
				temp = ch[k];
				ch[k] = ch[i];
				ch[i] = temp;
			}
		}
	}
	public static void main(String[] args)
	{
			System.out.println("Enter string: ");
			String str = Utility.getString();
			if(str.matches("[a-zA-Z0-9]+"))
			{	
				char[] ch  = str.toCharArray();
				permutations(ch, 0);
			}
			else
			{
				System.out.println("Enter valid input");
			} 
	}
}
