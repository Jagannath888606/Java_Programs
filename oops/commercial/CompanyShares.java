/**
 * @purpose		:To read the data by using getters and setters from json file
 * 
 * @author 		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

public class CompanyShares 
{
	private String companyName;
	private String stokeSymbol;
	private int noOfShares;
	private int price;
	private String dateTime;
	
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	
	public void setDateTime(String dateTime)
	{
		this.dateTime=dateTime;
	}
	
	public String toString()
	{
		StringBuilder sb= new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d \n", companyName,noOfShares,price));
		return sb.toString();
	}
	
	public String getStokeSymbol()
	{
		return stokeSymbol;
	}
	public void setStockSymbol(String stockSymbol)
	{
		this.stokeSymbol=stockSymbol;
	}
	
	public int getNoOfShares()
	{
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares)
	{
		this.noOfShares=noOfShares;
	}
	
	public String getDateTime()
	{
		return dateTime;
	}
	public void setDateTime()
	{
		String dateTime = java.util.Calendar.getInstance().getTime().toString();
		this.dateTime=dateTime;
	}
	public int totalValue()
	{
		return noOfShares*price;
	}
	
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}
