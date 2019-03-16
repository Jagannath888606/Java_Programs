/******************************************************************************************

 * 	@purpose      :  One string is an anagram of another
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 11-03-2019
 ******************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class Anagram_Program 
{
	public static void main(String[] args)
	{
			System.out.println("Enter first string");
			String str1 = Utility.getString();	
			System.out.println("Enter second string");
			String str2 =Utility.getString();
			if(str1.matches("[a-zA-Z]+"))
			{
				boolean staus= Utility.anagram(str1,str2);
				
				if (staus==true)
				{
					System.out.println(str1+" is anagram of "+str2);
				}
				else
				{
					System.out.println(str1+" is not anagram of "+str2);
				}
			}
			else
			{
				System.out.println("Enter valid input");
			}
		
	}
}
