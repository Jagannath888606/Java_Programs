/**
 * @purpose		: To hold methods for using in another class
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

public class Stack<T> 
{
	@SuppressWarnings("rawtypes")
	StackList ls=new StackList();
	@SuppressWarnings("rawtypes")
	Node head;
	static int top;
	static Object[] arr;
	public static int size;

	public Stack(int n)
	{
		top=-1;
		size=n;
		arr=new String[n];
	
	}
	boolean isEmpty()
	{
		return (top<0);
	}
	
	@SuppressWarnings("hiding")
	public class Node<T>
	{
		T data;
		T next;
		
		Node(T new_data)
		{
			data=new_data;
			next=null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public boolean push(T new_data)
	{
		if(top>size)
		{
			System.out.println("stack overflow");
			return false;
		}
		
		else
		{
		
			arr[++top]=ls.push(new_data);

			return true;
		}
		
	}
	@SuppressWarnings({ "unused", "rawtypes", "hiding" })
	public <T> Object pop()
	{	
		Node temp=head;
		Object s;
		if(top < 0)
		{
			System.out.println("stack underflow");
			return null;
		}
		else
		{
		  s=arr[top--];
		 System.out.print(" "+s);
		return s;
		}

		
	}
}
