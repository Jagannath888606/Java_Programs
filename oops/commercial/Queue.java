/**
 * @purpose		: To write methods for using in another class
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

public class Queue<T>
{
	@SuppressWarnings("rawtypes")
	QueueList ls=new QueueList();
	private Object arr[] ;         
	private int front;        
	public int rear;        
	public static int capacity;      
	private int count;        
	
	public Queue(int size )
	{
		arr =new Object[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	} 
	public static class Node<T>
	{
		T data;
		T next;
		
		Node(T d)
		{
			data=d;
			next=null;
		}
	}
	public int size()
	{
		return count;
	}

	
	public Boolean isEmpty()
	{
		return (size() == 0);
	}


	public Boolean isFull()
	{
		return (size() == capacity);
	}
	
	
	public void dequeue()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		else
		{
		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
		}
	}

	
	public void enqueue(T new_data)
	{
		//Node<T> new_node=new Node(new_data);
		
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		//System.out.print(" "+ new_node.data);

		rear = (rear + 1) % capacity;
		arr[rear] =new_data;
		count++;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void push(T new_data)
	{
		@SuppressWarnings("unused")
		Node<T> new_node=new Node(new_data);
		
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		rear = (rear + 1) % capacity;
		arr[rear] =ls.last(new_data);
		
		count++;
	}
	public void pop()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		else
		{
		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
		}
	}
}
