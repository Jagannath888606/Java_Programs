/**
 * @purpose		: To write methods and using it another 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

import java.util.Scanner;

public class Runnable 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scint=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scstr=new Scanner(System.in);
		boolean value = true;
		
		while(value)
		{
			StockAccount stockA = new StockAccount();
		
			System.out.println("Enter the choice");
			System.out.println("1. Add Stock Account");
			System.out.println("2. Get Total Value of Stock");
			System.out.println("3. Buy Shares");
			System.out.println("4. Sell Shares");
			System.out.println("5. Print Report");
			System.out.println("6. Exit");
			int n=scint.nextInt();
			switch(n)
			{
				case 1:
						StockAccount newStock = new StockAccount("Customer.json");
						break;
			
				case 2:	double totalValue = stockA.valueOf();
						if(totalValue >= 0)
						{
							System.out.println(totalValue);
						}
						break;
						
						
				case 3: System.out.println("Enter the shares");
						int shares = scint.nextInt();
						System.out.println("Enter the Symbol");
						String symbol = scstr.next().toUpperCase();
						stockA.buy(shares, symbol);
						break;
						
				case 4: System.out.println("Enter the shares");
						shares = scint.nextInt();
						System.out.println("Enter the Symbol");
						symbol = scstr.next().toUpperCase();
						stockA.sell(shares, symbol);
						break;
						
				case 5: stockA.printReport();
						break;
						
				case 6: value = false;
						break;
						
				default: System.out.println("invalid choice");
			}			
		}
	}
}
