
/******************************************************************************************
 * 	@purpose      :  To hold all the method of linkedlist 
 *  
 *  @author       : B.Jagannath
 *  @version      : 1.0
 *  @since        : 20-01-2019
 ******************************************************************************************/

package com.bridgeit.datastructure_programs;

public class LinkedList_Program<T>
{
	Node head; // declearing head node 
	public class Node 
	{
		T data;
		Node ref;
	}
/**
 * @parm T       : It takes generic datatype as command line arugument
 * @purpose      : This  method is used to add String data to a linkedlist
 * @return       : void
 **/	
	public  void add(T data)
	{
		Node node = new Node(); // creating nodes
		node.data = data;// adding data
		
		if(head == null)
		{
			head = node;  // make head as a first node
		}
		else 
		{
			Node n = head; 
			
			while (n.ref!=null) // take refrence values
			{
				n=n.ref; //changing reference values
			}
			n.ref = node;
		}
		
	}

/**
 * @purpose   : This  method is used to  display the data which is in linkedlist object
 * @return    : void
 **/	
	 public void display()
	 
	 {
		 Node n = head; // making n as head node
		 
		while (n.ref!=null)
		{
			System.out.print(n.data+" "); // retreving the data
			n = n.ref; // changing refrence 
		}
		System.out.println(n.data); // retreving last element
		 
	 }
 /**
  * @parm  T        : It takes generic data type as command line arugument
  * @purpose        : This  method is used to search a specific element in a linkedlist
  * @return         : boolean
  **/	
	 
	 public boolean search(T word)
	 
	 {
		 Node n = head; // making n as head node
		 
		 while(n.ref!=null)// next reference value
		 {
			 if (n.data.equals(word)) // comparing data with user search value
			 {
				 return true;
			 }
			 	 
			 if(n.ref==null) // checking last element of object
			 {
				 n.data.equals(word); //comparing data with user search value
				 return true;
			 }
			 n =n.ref;
		 } 
		return false; 
	 }
	 
 /**
  * @parm T       : It takes generic data type as command line arugument
  * @purpose      : This  method is used to delete a specific element in a linkedlist
  * @return       : void
  **/		 
	 public void delete(T ele)
	
	 {
		 Node n = head;
		Node n1 = head;
		
		if (n.data.equals(ele)) // checking head element with user search element to delete 
		{
			head = head.ref; // changing reference value
		}
		while (n!=null)
		{
			 if (n.data.equals(ele)) // checking for the element in list
			{
				n1.ref = n.ref; // changing reference value
			}
			n1=n;
			n=n.ref;
		}
	 }	
		
/**
 * @parm T  : It takes generic data type as command line arugument
* @purpose       : This  method is used to add element at first position of linkedlist
* @return        : void
**/			
	 
	 public void addFirst(T  data)
	 {
		Node node = new Node(); // creating object 
		node.data = data; // adding data to first node
		node.ref = head; 
		head = node;
		 
	 }
	 
 /**
  * @purpose   : This  method is used to covert words in a list to string
  * @return    : string
  **/	
	 public String getString()
	 {
		 String output =" ";
		 Node n = head; // making n as head node
		 
		 while (n.ref!=null)
		 {
			output += n.data+" "; // adding all values to output variable
			n =n.ref;
		 }
		 output +=n.data; // adding last element
		 return output;
	 }
}
