/*******************************************************************************************************************
 * @purpose		:To creat stop watch
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:08-03-2019
 *******************************************************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class StopWatch_Program
{
	long startTime;
	long stopTime;
	public void start()
	{
		startTime=System.currentTimeMillis();
	}
	public void stop() 
	{
		stopTime=System.currentTimeMillis();
	}
	public static void main(String[] args) 
	{
		try
		{
			StopWatch_Program stopwatch=new StopWatch_Program();
			System.out.println("Enter 0 for start the stopwatch");
			int i=Utility.inputInt();
			if(i==0)
			{
				stopwatch.start();
				System.out.println(stopwatch.startTime);
			}
			System.out.println("Enter 1 to stop the stopwatch ");
			int j=Utility.inputInt();
			if(j==1)
			{
				stopwatch.stop();
				System.out.println(stopwatch.stopTime);
			}
			System.out.println("seconds= " +((stopwatch.stopTime)-(stopwatch.startTime))/1000);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Enter valid input");
		}
	}
}
