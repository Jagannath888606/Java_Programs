/**
 * @purpose		: To read the data from file and using it to print 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockUtility 
{
	public static ObjectMapper objM = new ObjectMapper();

	/**
	 * @purpose creates a new object in Customer file
	 * @param fileName
	 */
	public static void addAccount(String fileName)
	{
		fileName ="/home/administrator/Documents/jsonfiles/"+ fileName;
					
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try 
		{
			List<Customer> customerList = objM.readValue(new File(fileName), new TypeReference<List<Customer>>() {
			});
			StockAccount stockA = new StockAccount();
			System.out.println("Enter customer's name: ");
			String custName =sc.next().toUpperCase();
			if(searchCustomerIndex(custName, customerList) == -1)
			{
				Customer newCustomer = new Customer(custName);
				customerList.add(newCustomer);
				System.out.println("\nNew Customer added : " + custName + "\n");
				
				stockA.save(fileName, customerList);	
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)", "ICICI(Shares)");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(customerList.get(searchCustomerIndex(custName, customerList)).toString());
			}
			else
			{
				System.out.println("\nCustomer already exist!");
			}
		}
		catch (IOException e)
		{
				e.printStackTrace();
		}
	}
	
	// search index
	public static int searchCustomerIndex(String searchName, List<Customer> customerList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < customerList.size(); i++)
		{
			count = 0;
			String custName = customerList.get(i).getName();
			if(searchName.compareTo(custName) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("Customer not found!");
		}
		
		return index;
	}
	
	public static int searchSharesBySymbol(String symbol, List<CompanyShares> companySharesList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < companySharesList.size(); i++)
		{
			count = 0;
			String companySymbol = companySharesList.get(i).getStokeSymbol();
			if(symbol.compareTo(companySymbol) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("Customer not found!");
		}
		
		return index;
	}
}
