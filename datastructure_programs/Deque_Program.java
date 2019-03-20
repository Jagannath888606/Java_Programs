/****************************************************************************************************
 * 	@purpose      : To hold common method of deque
 *  
 *  @author       : B.Jaganath
 *  @version      : 1.0
 *  @since        : 12-01-2019
 **************************************************************************************************/

package com.bridgeit.datastructure_programs;

public class Deque_Program
{
	int size;
	int front;
	int rear;
	char ch[];
    int chSize;
/**
 * @param int  : It takes integer value  as command line arguments 
 * @purpose    : constractor to intilize the size of array 
 */
	Deque_Program(int chSize)
	
	{
		this.chSize=chSize; // globalizeing chsize variable
		ch = new char[chSize];
	}
	
/**
 * @param char  : It takes character value  as command line arguments 
 * @purpose     : To add a character element to object at front
 * @return      : void 
 */
	
	public void addFront(char data)
	{
			
			ch[front]=data;// adding character data to from front of array
			front++; // changing front to next location
			size++; // increment size variable
	}
	
/**
 * @param char  : It takes character value  as command line arguments 
 * @purpose     : To add a character element to object at rear
 * @return      : void 
 */
	public void addRear(char data)
	{
		if (rear == 0)
		{
			rear = chSize;
		}
		
		ch[rear-1] = data; // adding data to rear position
		rear--; // decrementing rear value
		size++; // incrementing size variable
	}
	
/**
 * @purpose     : To get  a character element from object at front position
 * @return      : char
 */	
	public char getFront()
	
	{
		char output = ch[front]; // reintializeing output variable with front data 
		front++; // incrementing front value
		return output;
	}
	
/**
 * @purpose     : To get  a character element from object at rear position
 * @return      : char
 */	
	public char getRear()
	{
		rear = size-1;// intilizating rear with size of deque
		char output = ch[rear]; // giving character to output variable
		rear--;
		return output;
	}
/**
 * @purpose     : To get  size of object
 * @return      : int
 */		
	public int size()
	{
		return size; // returning size 
	}

/**
 * @purpose     : To display elements in object
 * @return      : void
 */	
	public void show()
	{
		// for loop to print elements in object
		for (int i= 0;i<size;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}
