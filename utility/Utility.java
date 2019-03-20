/********************************************************************************************************************
 * @purpose		:To place the common functions under one class
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:09-04-2019
 ********************************************************************************************************************/

package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{	
	static Scanner sc =new Scanner(System.in);
	
	//********************************************************************************************************************************************************//
	/**
	 * @purpose :To read only integer type of input from user and returns
	 *           integer value
	 * @return :int
	 **/
	public static  int inputInt()
	{
		return sc.nextInt();
	}
	//*********************************************************************************************************************************************************//
	/**
	 * @purpose :To read only string type of input from user and returns
	 *           string value
	 * @return :string
	 **/
	public static String getString()
	{
		return sc.next();
		
	}
	//********************************************************************************************************************************************************//
	/**
	 * @purpose :To read only double type of input from user and returns
	 *           double value
	 * @return :double
	 **/
	public static  double getDouble()
	{
		return sc.nextDouble();
	}
	//*******************************************************************************************************************************************************//
	/**
	 * @purpose :To read only double type of input from user and returns
	 *           double value
	 * @return :double
	 **/
	public static double getDist(double a,double b,double c)
	{
		return sc.nextDouble();
	}
	//**********************************************************************************************************************************************************//
	/**
	 * @purpose :To read only boolean type of input from user and returns
	 *           boolean value
	 * @return :boolean
	 **/
	public static boolean getBoolean()
	{
		boolean s = sc.nextBoolean();
		return s;
	}
	//************************************************************POWER OF TWO*******************************************************************************************//
	/**
	 * @purpose :This method take value as an argument and print all the power
	 *           values of 2
	 * @return : void
	 **/
	public static void powerOfTwo(int powerValue)
	{
		int number = 2;
		if (powerValue < 31 && powerValue > 0) 
		{
			System.out.println("Powers of 2 is: ");
			System.out.print(number + " ");
			for (int i=1;i<=powerValue;i++) 
			{
				number = number * 2;
				System.out.print(number + " ");
			}
		} 
		else 
		{
			System.out.println("please enter a power value between 1-30");
		}
	}
	//*******************************************************************************************************************************************************//
	/**
	 * @purpose :This method generates a random integer for given argument and
	 *           returns random number
	 * @return : int
	 **/
	public static int getRandomInteger(int length)
	{
		Random rd = new Random();
		int coupon = rd.nextInt(length);
		return coupon;

	}
	//*******************************************************************************************************************************************************//
	/**
	 * @purpose :To read only string type of input from user and returns
	 *           string value
	 * @return : string
	 **/
	public static String iuputString()
	{
		return sc.nextLine();
		
	}
	//******************************************************************************************************************************************************//
	/**
	 * @purpose :To read only boolean type of input from user and returns
	 *           boolean value
	 * @return :boolean
	 **/
	
	public static boolean scanBoolean()
	{
		boolean s = sc.nextBoolean();//calling next method to scan boolean value and store it in a variable
		return s;
	}
	//***********************************************************2D_ARRAY******************************************************************//
	/**
	 * @purpose :To read integer and double and boolean type of input from user and returns
	 *           integer as well as double and boolean values
	 * @return :void
	 **/
	
	
	
	public static void TwoDArray()
	{
		System.out.println("Enter 1 for integer array");
		System.out.println("Enter 2 for double array");
		System.out.println("Enter 3 for boolean array");
		int choice = Utility.inputInt();
		switch (choice)
		{
			case 1:
					System.out.println("Enter rows of array");
					int rows = Utility.inputInt();
					System.out.println("Enter coloums of array");
					int coloums = Utility.inputInt();
					int arr[][] = new int[rows][coloums];
					System.out.println("Enter your array");
					for (int i=0;i<arr.length;i++)
					{
						for (int j=0;j<arr.length;j++)
						{
							arr[i][j] = Utility.inputInt();
						}
					}
					for (int i=0;i<arr.length;i++)
					{
						for (int j=0;j<arr.length;j++)
						{
							System.out.print(arr[i][j]+" ");
						}
						System.out.println();
					}
					System.out.println();
					break;
			case 2:
					System.out.println("Enter rows of array");
					int rowd = Utility.inputInt();
					System.out.println("Enter coloums of array");
					int coloumd = Utility.inputInt();
					
					double arrd[][] = new double[rowd][coloumd];
					System.out.println("Enter your array");
					for (int i=0;i<arrd.length;i++)
					{
						for (int j=0;j<arrd.length;j++)
						{
							arrd[i][j] = Utility.getDouble();
						}
					}
					for (int i=0;i<arrd.length;i++)
					{
						for (int j=0;j<arrd.length;j++)
						{
							System.out.print(arrd[i][j]+" ");
						}
						System.out.println();
					}
					System.out.println();
					break;
				
			case 3:
					System.out.println("Enter rows of array: ");
					int rowb = Utility.inputInt();
					System.out.println("Enter coloums of array: ");
					int coloumb = Utility.inputInt();
					
					boolean arrb[][] = new boolean[rowb][coloumb];
					System.out.println("Enter your array");
					for (int i=0;i<arrb.length;i++)
					{
						for (int j=0;j<arrb.length;j++)
						{
							arrb[i][j] = Utility.getBoolean();
						}
					}
					for (int i=0;i<arrb.length;i++)
					{
						for (int j=0;j<arrb.length;j++)
						{
							System.out.print(arrb[i][j]+" ");
						}
						System.out.println();
					}
					System.out.println();
					break;
		}
	}
	
	//*****************************************************************************************************************************************************//
	/**
	 * @purpose :This method take a string as command line argument which is
	 *           used to display string values in character array
	 * @return : char[]
	 **/
	public static char[] convertStringToChar(String str1) 
	{
		char[] arr1=str1.toCharArray();
		
		return arr1;
	}
	public static char[] covertStringToChar(String str2)
	{
		char[] arr2=str2.toCharArray();
		
		return arr2;
	}
	//**************************************************************ANAGRAM OF STRINGS*************************************//
	/**
	 * @purpose :This method is used to find weather the given strings are anagram
	 *           are not
	 * @return : boolean
	 **/	
	public static boolean anagram(String str1,String str2)
	{
		// To make sure that there is no word case problems while performing action
				str1 = str1.toUpperCase();
				str2 = str2.toUpperCase();

				// Converting strings in to character array
				char ch[] = str1.toCharArray();
				char ch1[] = str2.toCharArray();

				// sorting the character array
				Arrays.sort(ch);
				Arrays.sort(ch1);

				// Converting strings in to character array
				String s3 = new String(ch);
				String s4 =new String(ch1);

				// condition checking for anagram
				if (s3.length() == s4.length())
				{
					if (s3.equals(s4)) 
					{
						return true;
					}
				}
				return false;
	}
	//**************************************************************PRIME NUMBERS******************************************//
	/**
	 * @purpose :This method is used to find prime numbers between 1-1000 and
	 *           returns as a string arraylist
	 * @return : ArrayList<String>
	 **/
	public static ArrayList<String> primeNumbers(int range )
	{
		int i=0;
		ArrayList<String> list=new ArrayList<String>();// creating a string type array list to store prime numbers
		System.out.println("Enter range of value: ");
		range=Utility.inputInt();
		for(i=2;i<=range;i++)//loop for repeate the range times
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				list.add(i+" ");
			}
		}
		return list ;
	}
	//***************************************************PRIME NUMBERS WITH ANAGRAM****************************************//
	/**
	 * @purpose:This method is used to find the prime numbers which are anagram
	 * @return :ArrayList<String>
	 **/
	public static ArrayList<String> anagramPrime()
	{
		// creating arraylist to add all prime numbers
				ArrayList<String> al = new ArrayList<String>();
				ArrayList<String> al1 =new  ArrayList<String>();
				// calling prime method
				al.addAll(primeNumbers(1000));

				int size = al.size();
				String[] arr = new String[size];

				// converting arraylist to string array
				arr = al.toArray(arr);

				// loop to find prime anagram
				for (int k = 0; k < arr.length; k++) 
				{
					for (int i = 0; i < arr.length; i++) 
					{
						if (anagram(arr[k], arr[i])==true)
						{
							al1.add(arr[k]);
						}
					}

				}
		return al1;
	}
	//*********************************************PRIME NUMBERS WITH PALINDROME***********************************************************************//
	/**
	 * @purpose:This method is used to find the prime numbers which are palindrome or not
	 * @return :void
	 **/
	public static void palindrome()
	{
		System.out.println("Enter range of prime numbers ");
		 int range=Utility.inputInt();
		 boolean isPrime;
		 int rem, temp, reversed;
		 for (int number=2;number <=range;number++)
		 {
			 isPrime = true;
			 if (number>=2)
			 {
				 for(int i=2;i<=(number/2);i++)
				 {
					 if((number % i)==0)
					 {
						 isPrime=false;
					 }
				 }
				 if (isPrime)
				 {
					 temp =number;
					 reversed =0;
					 while (temp!=0)	
					 {
						 rem=temp%10;
						 reversed=(reversed*10)+rem;
						 temp/=10;
					 }
					 if (reversed==number) 
					 {
						 System.out.print(number + " ");
					 }
				 }
			 }
		 }
		 System.out.println();
	 }
//*****************************************************************************************************************************************************************//	
	/**
	 * @purpose :This method take a string array as command line argument which is
	 *           used to display string values in that array
	 * @return :void
	 **/
	public static void displayString(String a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
//**************************************BINARY SEARCH FOR STRING*********************************************************// 
	/**
	 * @purpose :This method is used to search a string form a fixed string array
	 *           using binary search technique
	 * @return :void
	 **/
	public static void binarysearchofstring()
	{
		System.out.println("Enter string: ");
		 String first  = Utility.getString();
		 if(first.matches("[a-zA-Z]+"))
		 {
			 String [] sort1=first.split("");
			 Arrays.sort(sort1);
			 for(String k:sort1)
			 System.out.println(k);
			 System.out.println("Enter  string to search");
			 String search= Utility.getString(); 
			 int firstindex=0;
			 int lastindex=sort1.length-1;
			 long startTime=System.nanoTime();
			 long stopTime=0;
			 while(firstindex<=lastindex)
			 {
				 int mid=(firstindex+lastindex)/2;
				 if(search.compareTo(sort1[mid])==0)
				 {
					 stopTime=System.nanoTime();
					 System.out.println("Search element found at"+(mid+1));
					 break;
				 }
				 if(search.compareTo(sort1[mid])>0)
				 {
					 firstindex=mid+1;
					       
				 }
				 else
				 {
					 lastindex=mid-1;
				 }
			 } 
			if(firstindex>lastindex)
			{
				System.out.println("Element is not found");
			}
			 System.out.println("Time taken for searcing of string "+(stopTime-startTime));
		 }
		 else
		 {
			 System.out.println("Enter valid input");
		 }

	}
//*****************************************************BINARY SEARCH FOR INTEGER*********************************************//
	/**
	 * @purpose :This method is used to search a interger from a fixed integer
	 *           array usinf binary search technique
	 * @return :void
	 **/
	public static void binarySearchForInt()
	{
		System.out.println("Enter number of elements: ");
		int n=Utility.inputInt();
		int array[]=new int[n];
		System.out.println("Enter "+n+ " array elements");
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]=Utility.inputInt();
		}
		int firstIndex=0;
		int lastIndex=array.length-1;
		int mid=(firstIndex+lastIndex)/2;;
		long startTime=System.nanoTime();
		long stopTime=0;
		System.out.println("Enter search element: ");
		int searchElement=Utility.inputInt();
		while(firstIndex<=lastIndex)  
		{
			if(array[mid]==searchElement)
			{
				stopTime=System.nanoTime();
				System.out.println("search element is "+mid+" postion");
				break;
			}
			else if(searchElement>array[mid])
			{
				firstIndex=mid+1;
			}
			else
			{
				lastIndex=mid-1;
			}
			mid=(firstIndex+lastIndex)/2;
			
		}
		if(firstIndex>lastIndex)
		{
			System.out.println("Element is not found");
		}

		System.out.println("Time taken for searcing of integer "+(stopTime-startTime));
	}

//*****************************************INSERTION SORT INTEGER**********************************************************//
	/**
	 * @purpose :This method is used to sort an fixed integer array using
	 *           insertionsort technique
	 * @return :void
	 **/
	public static void insertionSortForInt()
	{
		System.out.println("Enter number of elements: ");
		int n=Utility.inputInt();
		int[] array=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)  
		{
			array[i]=Utility.inputInt();
		}
		long startTime=System.nanoTime();
		long stopTime;
		for(int i=0;i<array.length;i++)
		{
			int key=array[i];
			for(int j=i-1;j>=0 && array[j]>key;j--)
			{
				key=array[j+1];
				array[j+1]=array[j];
				array[j]=key;
				
			}	
		}
		stopTime=System.nanoTime();
		System.out.println("Sorted elements are: ");
		for(int ele:array)
		{
			System.out.println(ele);
		}
		System.out.println("Time taken for insertion sort  of elements "+(stopTime-startTime));
	}
	//**********************************************INSERTION SORT FOR STRING************************************************//
	/**
	 * @purpose:This method is used to sort a fixed string array using
	 *          insertionsort technique
	 * @return :void
	 **/
	public static void insertionSortForStr()
	{
		System.out.println("Enter string: ");
		String str=Utility.getString();
		if(str.matches("[a-zA-Z]+"))
		{
			char[] chArr=str.toCharArray();
			long startTime=System.nanoTime();
			long stopTime;
			for(int i=0;i<chArr.length;i++)
			{
				char ele=chArr[i];
				for(int j=i-1;j>=0 && chArr[j]>ele;j--)
				{
					ele=chArr[j+1];
					chArr[j+1]=chArr[j];
					chArr[j]=ele;
				}
			}
			stopTime=System.nanoTime();
			System.out.println("Sorted array is:");
			for(char ch:chArr)
			{
				System.out.println(ch);
			}
			System.out.println("Time taken for insertion  sort  of string "+(stopTime-startTime));
		}
		else
		{
			System.out.println("Enter valid type of input ");
		}
	}

	//*******************************************BUBBLE SORT FOT INTEGER***************************************************//
	/**
	 * @purpose :This method is used to sort a fixed integer array using bubblesort
	 *           technique
	 * @return :void
	 **/
	public static void bubbleSortForInteger()
	{
		System.out.println("Enter sorted array size:  ");
		int n=Utility.inputInt();
		int[] array=new int[n];
		long startTime=System.nanoTime();
		long stopTime;
		System.out.println("Enter sorted elements: ");
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]=Utility.inputInt();
		}
		for(int i=0;i<=array.length-1;i++)
		{
			int temp;
			for(int j=0;j<=array.length-2;j++)
			if(array[j]>array[j+1])
			{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
		stopTime=System.nanoTime();
		System.out.println("Sorted elements are: ");
		for(int elements:array)
		{
			System.out.println(elements);
		}
		System.out.println("Time taken for bubble sort  of elements "+(stopTime-startTime));
	}
	//************************************BUBBLE SORT FOR STRING************************************************************//
	/**
	 * @purpose :This method is used to sort a fixed string array using bubblesort
	 *           technique
	 * @return :void
	 **/
	public static void BubbleSortForString()
	{
		System.out.println("Enter string: ");
		String str=Utility.getString();
		if(str.matches("[a-zA-Z]+"))
		{
			char[] ch=str.toCharArray();
			long startTime=System.nanoTime();
			long stopTime;
			for(int i=0;i<=ch.length-1;i++)
			{
				char temp;
				for(int j=0;j<=ch.length-2;j++)
				{
					if(ch[j]>ch[j+1])
					{
						temp=ch[j];
						ch[j]=ch[j+1];
						ch[j+1]= temp;
					}
				}
			}
			stopTime=System.nanoTime();
			String str1=new String(ch);
			System.out.println("Sorted string is: "+str1);
			System.out.println("Time taken for bubble sort  of string "+(stopTime-startTime));
		}
		else
		{
			 System.out.println("Enter valid data");
		}
	}
	//*******************************************INSERTION SORT FOR STRINGS***********************************************//
	/**
	 * @purpose:This method is used to sort a fixed string array using
	 *          insertionsort technique
	 * @return :void
	 **/
	public static void insertStrings()
	{
		 String[] array= {"J2SE","J2EE","MUMBAI","HYDERABAD","ANDRA"};
		 String temp="";
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[i].compareToIgnoreCase(array[j])>0)
				 {
					 temp = array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			 }
		}
		System.out.println("Sorted Strings are: ");
		for(String sortedArray:array)
		{
			 System.out.println(sortedArray);
		}
	}
	
	//*************************************TEMPERATURE CONVERTION**********************************************************//
	/**
	 * @purpose :This method is used to convert temperature from celsius to
	 *           fahrenheit and vice versa and returns corresponding value
	 * @return :double
	 **/
	public static double temperatureConvertion()
	{
		System.out.println("Enter 0 for convert temperature into fahrenheit to celsius: ");
		System.out.println("Enter 1 for convert temperature into celsius to fahrenheit: ");
		int choice=Utility.inputInt();
		/*convertion of celsius  temperature */
		if(choice==0)
		{
			System.out.println("Enter temperature in fahrenheit: ");
			double fahrenheitTemp=Utility.getDouble();
			double celsiusTemp= (fahrenheitTemp-32)*5/9;
			System.out.println("Converted temperature in celsius: "+celsiusTemp);
		}
		/* convertion of fahrenheit temperation*/
		else if(choice==1)
		{
			System.out.println("Enter temperature in celsius: ");
			double celsiusTemp=Utility.getDouble();
			double fahreheitTemp=(celsiusTemp*9/5)+32;
			System.out.println("converted temperatyre fahrenheit: "+fahreheitTemp);
		}
		else
		{
			System.out.println("Entered input is wrong try again: ");
		}
		return choice;		
	}
	//**********************************************MONTHLY PAYMENT***************************************************************//
	/**
	 * @purpose :This method is used to find the monthly payment amount with
	 *           interest on a principle amount and returns the value
	 * @return :double
	 **/
	public static double monthlyPayment(double principle, double year ,double rate)
	{
		double r=rate/(12*100);
		double n=12*year;
		double payment=principle*r/(1-Math.pow(1+r, -n));
		return payment;
	}
	//**********************************************SRUARE ROOT OF NON NEGATIVE NUMBER**************************************************************//
	/**
	 * @purpose :This method is used to find square root a given number and returns 
	 *           the value
	 * @return :double
	 **/
	public static double squareRootOfNon(double c)
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs((t-c/t))>epsilon*t)
		{
			t=((c/t+t)/2);
		}
		return t;
	}
    //**********************************************************DECIMAL TO BINARY**********************************************************************************************//
	/**
	 * @purpose :This method is used to convert given decimal number to
	 *           corresponding binary number
	 * @return :string
	 **/
	public static String toBinary(int dec)
	{
		String str1 = "";
		String str2= "";
		char ch;
		while (dec > 0)
		{
			int r = dec % 2;
			str1 += r;
			dec = dec / 2;
		}
		while (str1.length() < 8)
		{
			str1 += "0";
		}
		for (int i = str1.length() - 1; i >= 0; i--) 
		{
			ch = str1.charAt(i);
			str2 += ch;
		}
		return str2;
	}
	//*********************************************************SWAP NIBBLES************************************************************************//
	/**
	 * @purpose :This method is used to find a new decimal number after swap the
	 *           nibbles of its binary format
	 * @return :void
	 **/
	public static void toDecimal(String str2) 
	{
		String str3 = str2.substring(0, 4); // spliting string with index numbers
		String str4 = str2.substring(4, 8);// spliting string with index numbers
		String swap = str4 + str3; // swapped string
		System.out.println("Binary value after swaping: "+ swap);
		int bin = Integer.parseInt(swap, 2); // converting to binary
		System.out.println("Decimal value after swaping nibbles: "+ bin);
	}
	//******************************************************************************************DAY OF WEEK***********************************************************************//
	/**
	 * @purpose :This method is used to find which day falls on the date
	 * @return :int
	 **/
	public static int dayOfWeek(int day,int month,int year)
	{
		/* standrad formula of Gregorian calenda */
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;  
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d= (day + x + (31 * m0) / 12) % 7;
		if (day <= 31 && month <= 12 && year <= 9999) 
		{
			switch (d) 
			{
				case 0:
					System.out.println("The day is sunday");
					break;
	
				case 1:
					System.out.println("The day is monday");
					break;
	
				case 2:
					System.out.println("The day is tuesday");
					break;
	
				case 3:
					System.out.println("The day is wednesday");
					break;
	
				case 4:
					System.out.println("The day is thursday");
					break;
	
				case 5:
					System.out.println("The day is friday");
					break;
	
				case 6:
					System.out.println("The day is saturday");
					break;
	
				default:
					System.out.println("invalid");
			}
		} 
		else
		{
			System.out.println("invalid date");
		}
		return d;
	}

	//*************************************************************************************************************************************************************************************//
	/**
	 * @purpose :This method is to search a string value from an array using binary
	 *           search technique
	 * @return : boolean
	 **/
	public static boolean binarySearch(String arr[], String userSearch)
	{
		int count = 0;
		int start = 0;
		int end= arr.length;
		while (start < end) 
		{
			int mid = start + (end - start) / 2;
			if (arr[mid].equalsIgnoreCase(userSearch))// condition to check if strings are equal are not
			{
				count++;
			}

			if (arr[mid].compareToIgnoreCase(userSearch) > 1)// comparing the strings to trim array
			{
				start = mid + 1;
			} 
			else
			{
				end= mid - 1;
			}
		}
		if (count > 0) 
		{

			return true;

		}
		else
		{
			return false;
		}
	}
	//***************************************************************************BINARY SEARCH FOR FIND WORD FROM FILE*************************************************************************************//
	/**
	 * @purpose :This method is used to find a word from a file using binarysearch
	 *           technique
	 * @return :boolean
	 **/
	
	public static boolean binarySearchFile(String s1) 

	{
		try 
		{
			String line;
			String path = "/home/administrator/Documents/sample.txt";
			ArrayList<String> al = new ArrayList<String>();
			FileInputStream fis = new FileInputStream(path);// byte stream format
			InputStreamReader isr = new InputStreamReader(fis);// converting byte stream to character stream
			BufferedReader br = new BufferedReader(isr); // reading the character stream using bufferedreader class
			while ((line = br.readLine()) != null)// storing file data in a string
			{
				String word[] = line.split(" "); // spliting each word and storing in a string array
				for (int i = 0; i < word.length; i++) 
				{
					al.add(word[i]);// adding to arraylist
				}
			}
			br.close();
			int arrSize = al.size();
			String list[] = new String[arrSize];
			list = al.toArray(list);// converting arraylist to a string array
			Arrays.sort(list);// sorting the array

			if (binarySearch(list, s1) == true) 
			{
				return true;
			} 
			else 
			{
				return false;
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e);
		}
		return false;

	}
	//**************************************************************************************************************************
	/**
	 * @purpose :To read only string word type of input from user and returns
	 *           string value
	 * @return : string
	 **/

	public static String scanWord()
	{
		String s = sc.next(); //calling next method to scan word and store it in a variable
		return s;
	}
	
	/**
	 * @param String : This method takes string as command line aruguments
	 * @purpose      : This method is used to read data from file store them in a string  array
	 * @return       : string array
	 **/
		public static String[] fileReadString(String path) throws Exception
		{
			String line;
			FileReader file = new FileReader(path); // reading data from file
			BufferedReader read = new BufferedReader(file); // reading data from fr object

			/* reading data from br object and adding it to linkedlist */
			while ((line = read.readLine())!= null) 
			{
				String word[] = line.split(" ");// adding word in file to word array
				return word;
			}
			read.close();
			return null;
		}
		

/**
 * @param String : This method takes string as command line aruguments
 * @purpose      : This method is used to read data from file store them in a integer array
 * @return       : int array
 **/
	
	public static int[] fileReadInt(String path) throws Exception
	{
		String line;
		FileReader file = new FileReader(path); // reading data from file
		BufferedReader br = new BufferedReader(file); // reading data from fr object

		/* reading data from br object and adding it to linkedlist */
		while ((line = br.readLine()) != null) 
		{
			String word[] = line.split(" ");
			int size = word.length;
			int arr[] = new int[size];
			/* for loop to convert string to integer data*/
			for (int i = 0; i < arr.length; i++)
			{
				arr[i] = Integer.parseInt(word[i]);

			}

			br.close();
		}
		return null;
	}
		
		

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}