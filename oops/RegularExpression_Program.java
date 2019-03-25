package com.bridgeit.oops;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class RegularExpression_Program
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String path="/home/administrator/Documents/jsonfiles/regularexpression.json";
		File file=new File(path);
		ObjectMapper mapper=new ObjectMapper();
		try 
		{
			JsonNode rootNode=mapper.readTree(file);
			System.out.println(""+rootNode);
			String values="regular";
			System.out.println(""+values);
			JsonNode regular=rootNode.path(values);
			String str=regular.asText();
			System.out.println(""+str);
			
			System.out.println("Enter the name");
			String name=sc.nextLine();
		
			if(Pattern.matches("[a-zA-Z]+", name))					//replacing the name
			{
				str=str.replaceAll("<<name>>", name);				
			}

			System.out.println("Enter the fullname");
			String fullname=sc.nextLine();
			if(Pattern.matches("[a-zA-Z]+",fullname ))				
			{
				str=str.replaceAll("<<full name>>", fullname);			//replacing the fullname
			}

			System.out.println("Enter the phone number ");
			String number=sc.nextLine();
			if(Pattern.matches("[0-9]+",number))	
			{
				str=str.replaceAll("x{10}",number);
			}
				
			Date currentDate = new Date();								//reading current date 
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	        String date = sdf.format(currentDate);
	        str=str.replaceAll("dd/mm/yyyy", date);
			
	        System.out.println(""+str);	
		} 
		catch (IOException e) 
		{
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
	}
}
