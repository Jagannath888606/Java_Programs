
/********************************************************************************************
 * @purpose		:To hold stock variables and getters and setters methods of that variables
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:26-03-2019
 *******************************************************************************************/

package com.bridgeit.oops;


public class StockReport_Program 
{
	private String name;
	private String company;
	private String symbol;
	private int shares;
	private int price;
	private int totalprice;
	public int getTotalprice()
	{
		return totalprice;
	}
	public void setTotalprice(int totalprice) 
	{
		this.totalprice = totalprice;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getSymbol()
	{
		return symbol;
	}
	public void setSymbol(String symbol) 
	{
		this.symbol = symbol;
	}
	public int getShares()
	{
		return shares;
	}
	public void setShares(int shares) 
	{
		this.shares = shares;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
}
