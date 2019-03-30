/*******************************************************************************************************
* 	@purpose      : To read inventory data from json file and calculate total cost of  each inventory
*  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 25-03-2019
****************************************************************************************************************/

package com.bridgeit.oopss;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryDataManagement_Program
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String Path="/home/administrator/Documents/jsonfiles/inventory.json";
		File file=new File(Path);
		ObjectMapper mapper=new ObjectMapper();
		try 	
		{
			JsonNode rootNode=mapper.readTree(file);
			JsonNode inventory=rootNode.get("Rice");				//reading Rice elements
			System.out.println("=====RICE=====");				
			for(JsonNode node:inventory)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\nPrice: "+price+" Rs"+"\nWeight: "+weight+" Kg");
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
			JsonNode inventory1=rootNode.get("Pulses");
		
			System.out.println("====PULSES====");					//reading Pulses elements
			for(JsonNode node:inventory1)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\nPrice: "+price+" Rs"+"\nWeight: "+weight+" Kg");
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
		
			JsonNode inventory2=rootNode.get("Wheat");
			System.out.println("====WHEAT====");					//reading Wheat elements
	
			for(JsonNode node:inventory2)
			{
				//System.out.println(""+node);
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\nPrice: "+price+" Rs"+"\nWeight: "+weight+" Kg");
				System.out.println("total: "+price*weight+" Rs"+"\n");
			}
	
		}
	
		catch (IOException e)
		{
			System.out.println(""+e.getMessage());		
			e.printStackTrace();
		}
		sc.close();
	}
}
