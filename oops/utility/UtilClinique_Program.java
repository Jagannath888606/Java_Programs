package com.bridgeit.utility;

import java.io.File;
import java.util.Scanner;

public class UtilClinique_Program 
{
	/**
	 * in this method reading the file path 
	 * @param path it is given by the user or developer
	 * @return the file object
	 */
	public static File getFile(String path)
	{
		File file = new File(path);
		return file;
	}
	
	/**
	 * static object is created for Scanner class to avoid multiple object creations
	 * of the same class.
	 */
	static Scanner sc = new Scanner(System.in);// Scanner class declaration

	// method for scanner class of integer type
	/**
	 * static function to read integers input from the user
	 * 
	 * @return integer values that are read
	 */

	public static int readInteger() 
	{
		return sc.nextInt();
	}

	// method for scanner class of double type
	/**
	 * static function to read double input from the user
	 * 
	 * @return double values that are read
	 */
	public static double readdouble() 
	{
		return sc.nextDouble();
	}

	// method for scanner class of String type
	/**
	 * static function to read String input from the user
	 * 
	 * @return String values that are read
	 */
	@SuppressWarnings("resource")
	public static String readString()
	{
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

	// method for scanner class of Boolean type
	/**
	 * static function to read Boolean input from user
	 * 
	 * @return Boolean values that are read
	 */
	public static boolean readBoolean()
	{
		return sc.nextBoolean();
	}
	
	public static long readlong()
	{
		return sc.nextLong();
	}
}
