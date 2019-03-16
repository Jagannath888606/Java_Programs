
/*******************************************************************************************************************
 * @purpose		:Tic Tac Toe
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:14-03-2019
 *******************************************************************************************************************/
package com.bridgeit.functional;

import java.util.Random;

import com.bridgeit.utility.Utility;

public class Tic_Tac_Toe 
{
	static String arr [][] = new String [3][3];
	static int row;
	static int col;
	public static void display(String arr[][])
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void board()
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				arr[i][j] = "-- ";
			}
		}
	}
	public static String playGame()
	{
		for (int i=0;i<5;i++)
		{	
			System.out.println(" It is computer turn");
			int count =0;
			while (count==0)
			{
				Random rd=new Random();
				row=rd.nextInt(3);
				col = rd.nextInt(3);
				if (arr[row][col]=="-- ")
				{
					count++;
					arr[row][col]="X";
				}
				if(arr[0][0]=="X"&&arr[0][1]=="X"&&arr[0][2]=="X"||
					 arr[1][0]=="X"&&arr[1][1]=="X"&&arr[1][2]=="X"||
					arr[2][0]=="X"&&arr[2][1]=="X"&&arr[2][2]=="X"||
					arr[0][0]=="X"&&arr[1][0]=="X"&&arr[2][0]=="X"||
					arr[0][1]=="X"&&arr[1][1]=="X"&&arr[2][1]=="X"||
					
					arr[0][2]=="X"&&arr[1][2]=="X"&&arr[2][2]=="X"||
				    arr[0][0]=="X"&&arr[1][1]=="X"&&arr[2][2]=="X"||
				    arr[2][0]=="X"&&arr[1][1]=="X"&&arr[0][2]=="X")
				{
					display(arr);
					return " COMPUTER WIN";
				}
				display(arr);
				System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			}
			System.out.println("Its is user turn");
			System.out.println();
			count =0;
			while (count == 0)
			{ 
				System.out.println("Enter row");
				row = Utility.inputInt();
				System.out.println("Enter col");
				col = Utility.inputInt();
				if(arr[row][col]=="-- ") 
				{
					count++;
					arr[row][col] = "O";
				}
				else
				{
					System.out.println("Place is occupied");
					System.out.println("Playing cheating game");
					System.out.println("Exiting the game");
					System.exit(0);
				}
			}
			if(arr[0][0]=="O"&&arr[0][1]=="O"&&arr[0][2]=="O"||
					 arr[1][0]=="O"&&arr[1][1]=="O"&&arr[1][2]=="O"||
					arr[2][0]=="O"&&arr[2][1]=="O"&&arr[2][2]=="O"||
					arr[0][0]=="O"&&arr[1][0]=="O"&&arr[2][0]=="O"||
					arr[0][1]=="O"&&arr[1][1]=="O"&&arr[2][1]=="O"||
					arr[0][2]=="O"&&arr[1][2]=="O"&&arr[2][2]=="O"||
				    arr[0][0]=="O"&&arr[1][1]=="O"&&arr[2][2]=="O"||
				    arr[2][0]=="O"&&arr[1][1]=="O"&&arr[0][2]=="O")
			{
				display(arr);
				return "USER WIN ";
			}
			display(arr);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		}
		return "DRAW";
	}

	public static void main(String[] args)
	{
		try 
		{
			System.out.println("Lets start the game");
			System.out.println("First turn is computer");
			System.out.println("X---> is for computer");
			System.out.println("O---> is for player");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			System.out.println("board is ready to play");
			board();
			display(arr);
			System.out.println(playGame());
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
	}
}
