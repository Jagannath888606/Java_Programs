/**
 * @purpose		: To impliment methods and override it in another
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

import java.util.List;

public interface StockInteface
{
	public double valueOf();
	public void buy(int amount, String symbol);
	public void sell(int amount, String symbol);
	public void save(String fileName, List<Customer> customerList);
	public void printReport();
}
