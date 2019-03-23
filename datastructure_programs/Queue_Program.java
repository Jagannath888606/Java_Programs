/******************************************************************************************
 * 	@purpose      : To hold all the method of queue class 
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

public class Queue_Program 
{
	int size;
	int front;
	int rear;
	String arr[] ;
	int arrSize;
   /*calling constructor to intialize array size*/
	public Queue_Program(int arrSize)
	{
		this.arrSize = arrSize; // globalizing array size
		arr = new String [arrSize];
	}
	
/**
 * @param string  : It takes string   as command line arguments 
 * @purpose     : To add a string  element to object at front
 * @return      : void 
 */
   public void enQueue(String data)
   {
	   arr[rear] = data; // adding data to rear element
	   rear++; // changing rear position 
	   size++; // incrementing size
   }
   
  /**
   * @purpose     : to find no of elements in object
   * @return      : int 
   */
   public int size()
   {
	   return size; // returns the size of array
   }
   
   /**
    * @purpose     : To remove element
    * @return      : void 
    */
   public void deQueue()
   {
	  @SuppressWarnings("unused")
	  String temp = arr[front];// changing position to remove element
	  front++;
	  size--;
	  
   }
   
  /**
   * @purpose     : To display the elements in queue
   * @return      : void 
   */
   
   public void show()
   {
	   /*for loop to display all elements in queue*/
	   for (int i=0;i<size;i++)
	   {
		   System.out.print(arr[front+i]+" ");
	   }
	   System.out.println();
   }
}
