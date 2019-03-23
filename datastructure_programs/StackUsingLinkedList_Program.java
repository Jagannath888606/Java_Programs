/******************************************************************************************
 * 	@purpose      : To hold common functions of stack using linkedlist class
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 22-03-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

public class StackUsingLinkedList_Program<T> 
{
	/*Creating a inner class to hold node variables*/
	private class Node
	{
		T data ;
		Node ref;
	}
	Node top;
	int size;
	 @SuppressWarnings("unused")
	/**
	 * @param int :It takes as command line arguments
	 * @purpose   :This method is used to push integer values to objects
	 * @return	  :void
	 */
	
	public void push(T data)
	 {
		 Node node=new Node();//Creating object to node class
		 size++;
		 if(node==null)//Checking wheather the node is empty or not
		 {
			 System.out.println("Stack overflow");
			 return;
		 }
		 node.data=data;// Storing data
		 node.ref=top;//changing the reference value
		 top=node;//Changing top node
	 }
	 /**
	  * @purpose	:This method is used to pop integer element at the top of object
	  * @return		:void
	  */
	 public T pop()
	 {
		 if(top==null)//Checking wheather the top is null or not
		 {
			 System.out.println("Stack underflow");
			 return null;
		 }
		 T data=top.data;
		 top=(top).ref;
		 return data;
	 }
	 /**
	  * @purpose        : This method is used to diplay element in object
	  * @return         : void 
	  **/	
	public void display()
	{
	 	if (top==null) // checking wheather top is empty or not
	 	{
	 		System.out.print("stack overflow");
	 		System.exit(0);
	 	}
	 	else 
	 	{
	 		Node temp = top; //coping top to temp variable
	 		while (temp!=null)
	 		{
	 			System.out.print(temp.data+" "); // printing data
	 			temp=temp.ref; // changing reference value
	 		}
	 			
	 	}
	}
	 	
	 /**
	  * @purpose        : This method is used to return  size of object
	  * @return         : void 
	 **/
	public int size()
	{
		return size;
	}
	 
}
