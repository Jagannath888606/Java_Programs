/*******************************************************************************************************
* 	@purpose      : To read inventory data from json file and calculate total cost of  each inventory
*  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 25-03-2019
****************************************************************************************************************/

package com.bridgeit.oops;

import java.io.*;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryData_Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String Path = "/home/administrator/Documents/jsonfiles/inventory.json";
		File file = new File(Path);

		ObjectMapper mapper = new ObjectMapper();
		int num;
		try 
		{
			JsonNode rootNode = mapper.readTree(file);
			do 
			{
				System.out.println("Enter the Choice: ");
				System.out.println(" 1 for Rice" + "\n 2 for Wheat" + "\n 3 for Pulses");
				num = sc.nextInt();
			} 
			while (num < 0 || num > 4);
			{
				String Inventoryproduct = "";
				switch (num) 
				{
					case 1:
							Inventoryproduct = "Rice";
							break;
					case 2:
							Inventoryproduct = "Wheat";
							break;
					case 3:
							Inventoryproduct = "Pulses";
							break;
					default:
							System.out.println("Invalid Input");
				}
				JsonNode inventory = rootNode.path(Inventoryproduct);	//reading the entered choice
				for (JsonNode node : inventory) 
				{
					String name = node.path("name").asText();
					int weight = node.path("weight").asInt();
					int price = node.path("price").asInt();
					
					System.out.println("Name: " + name + "\nPrice: " + price + "\nWeight: " + weight);
					System.out.println("Total: " + price * weight + " Rs" + "\n");
				}
			}
		}
		catch (IOException e) 
		{
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}
			
}
