/******************************************************************************************
 * 	@purpose      :  To find given Arithmetic Expression is  balanced or not
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class Balanced_Parentheses
{
	/**
	 * @param args : it takes  string array  as command line aruguments
	 */
	public static void main(String[] args) 
	{
		char search;
		Stack_Program<Character> st = new Stack_Program<Character>();// creating object for stack class
		System.out.println("Enter your Arithmetic Expression ");
		final String Expression = Utility.getString();
		/*for loop is used  to push  and pop the paranthasis*/
		for (int i=0;i<Expression.length();i++)
		{
			search = Expression.charAt(i);
			if (search=='(')
			{
				st.push(search);// pushing the element to stack object 
			}
			else if (search ==')')
			{
				st.pop(); // removing the element from stack object
			}	
		}
		if (st.isEmpty()== true) // condition to check stack object is empty or not
		{
			System.out.println("Arithmetic Expression balanced");
		}
		else
		{
			System.out.println("Arithmetic Expression not balanced");
		}	
	}
}
