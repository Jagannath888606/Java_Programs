/**
 * @purpose		:To read the data by using getters and setters from json file
 * 
 * @author 		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

public class Customer
{
	private String name;
	private int relianceShares;
	private int hdfcShares;
	private int iciciShares;
	
	public Customer()
	{
		
	}
	
	// constructor
	public Customer(String custName)
	{
		this.name = custName;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, relianceShares, hdfcShares, iciciShares));
		
		return sb.toString();
	}
	
	// getter and setter methods
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getRelianceShares() 
	{
		return relianceShares;
	}
	
	public void setRelianceShares(int relainceShares) 
	{
		this.relianceShares = relainceShares;
	}
	
	public int getHdfcShares() 
	{
		return hdfcShares;
	}
	
	public void setHdfcShares(int hdfcShares)
	{
		this.hdfcShares = hdfcShares;
	}
	
	public int getIciciShares() 
	{
		return iciciShares;
	}
	
	public void setIciciShares(int iciciShares) 
	{
		this.iciciShares = iciciShares;
	}
}
