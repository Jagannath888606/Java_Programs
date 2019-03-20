/*******************************************************************************************************************
 * @purpose		:By using Static Functions to generate Random number and to process Distinct Coupons
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import java.util.ArrayList;
import java.util.Random;

import com.bridgeit.utility.Utility;

public class Coupon_Numbers 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Enter distinct coupon number");    
	        int coupon=Utility.inputInt();
	        ArrayList<Integer> a1=new ArrayList<Integer>();//creating object for array class
	        int count=0;
	        for(int i=0;i<=coupon;i++)
	        {
	            Random random=new Random();// using random to create random values
	            int coup=random.nextInt(coupon);
	            System.out.println(coup);
	            count++;
	            if(!a1.contains(coup))//checking random values with array values
	            {
	                a1.add(coup);//adding coupon number
	                break;
	            }
	            else
	            {
	                i--;
	            }
	            for(Integer k:a1)
	            {
		            System.out.println(k);
		            System.out.println("Total of all distinct numbers is "+ count);
	            }
	        }
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid data: ");
		}
	}
}
