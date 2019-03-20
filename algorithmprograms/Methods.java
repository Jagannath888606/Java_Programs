/*******************************************************************************************************************
 * @purpose		:BinarySearch method for Integer
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:11-03-2019
 *******************************************************************************************************************/

package com.bridgeit.algorithmprograms;

import com.bridgeit.utility.Utility;

public class Methods
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("press 1 for Binary search method for integer");
			System.out.println("Press 2 for Binary search method for string");
			System.out.println("Press 3 for Insertion sort method for integer");
			System.out.println("Press 4 for Insertion sort method for integer");
			System.out.println("Press 5 for Bubble sort method for integer");
			System.out.println("Press 6 for Bublle sort method for integer");
			int num=Utility.inputInt();
			switch(num)
			{
				case 1:Utility.binarySearchForInt();
						break;
				case 2:Utility.binarysearchofstring();
						break;
				case 3:Utility.insertionSortForInt();
						break;
				case 4://******************************Insertion sort for strings**********************************//
						Utility.insertStrings();
						//******************************* Insertion sort for string*********************************//
						System.out.println();
						Utility.insertionSortForStr();
						break;
				case 5:Utility.bubbleSortForInteger();
						break;
				case 6:Utility.BubbleSortForString();
						break;
				default:System.out.println("Enter valid data");
					
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Give valid input");
		}
	}
}
