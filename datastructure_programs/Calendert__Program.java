package com.bridgeit.datastructure_programs;

import com.bridgeit.utility.Utility;

public class Calendert__Program 
{
	public static void main(String[] args) 
	{
		final int Calender [][] = new int[6][7];
		final int M[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("Enter month");
		// calling inputInt method to  take month from user
		final int Month = Utility.inputInt();
		System.out.println("Enter year");
		// calling inputInt method to  take year from user
		final int Year = Utility.inputInt();
		
		/*validating month and year*/
		if ((Month<=12&&Month>=1)&&(Year>=1000&&Year<9999))
		{
			/*condition to check wheather the year is leap year or not*/
			if(Year%4==0 && Year%100!= 0 || Year%400==0)
			{
				M[1]=29;
			}
			/*this for loop is used to intilize array to -10 value*/
			for (int i=0;i<Calender.length;i++)
			{
				for (int j=0;j<Calender[i].length;j++)
				{
					Calender[i][j]=-1;
				}	
			}
		
			// calling getday method to get were the day start
			final  int D = Utility.getDay(Month,Year);
			int d1 = 1;   
		 // intilizing first row of the calender with d1 value
			for (int i = D; i < Calender[0].length; i++) 
			{		
				Calender[0][i] = d1++;		
			}
			// initilizing remaining rows and coloums with d1 value
			for (int i=1;i<Calender.length;i++)
			{
				for (int j=0;j<Calender[i].length;j++)
				{
					Calender[i][j] = d1++;
				}
			}
		
			System.out.println("\t"+"Sun"+"\t"+"Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thus"+"\t"+"Fri"+"\t"+"Sat");
			
			/* loops to print calender*/
			for (int i=0;i<Calender.length;i++)
			{
				for (int j=0;j<Calender[i].length;j++)
				{
					// condition to print a empty space where day is empty
					if(Calender[i][j]<0||Calender[i][j]>M[Month-1])
					{
						System.out.print("\t");
					}
					//condition to print calender 
					else if (Calender[i][j]>0)
					{
						System.out.print("\t"+Calender[i][j]+" ");
					}
				}
				System.out.println("\t");
			}
		}
		else
		{
			System.err.println("please enter valid month and year");
		}
	}
}
