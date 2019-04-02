/**
 * @purpose		: To hold methods and using it another 
 * 
 * @author		:B.Jagannath
 * @version		:1.0
 * @since		:29-03-2019
 */

package com.bridgeit.oops.commercial;

public class StackList<T> 
{

@SuppressWarnings("rawtypes")
static Node head;
	
	public static class Node<T>
	{
		public T data;
		public Node<T> next;
		
		public Node(T d)
		{
			data=d;
			next=null;
		}
	}
	
	@SuppressWarnings("unused")
	public int size()
	{
		int count=0;
		@SuppressWarnings("unchecked")
		Node<T> temp=head;
		int i=0;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		System.out.println("size:"+count);
		return count;
	}
	
	@SuppressWarnings("unchecked")
	public  T last(T new_data)
	{
		@SuppressWarnings("rawtypes")
		Node new_node=new Node(new_data);
		
		if(head==null)
		{
			head=new_node;
		}
		else
		{	
			new_node.next=null;
			@SuppressWarnings("rawtypes")
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
			
		}
		return new_data;
	}
	
	@SuppressWarnings("unchecked")
	public T push(T new_data)
	{
		@SuppressWarnings("rawtypes")
		Node new_node=new Node(new_data);
		
		new_node.next=head;
		head=new_node;
		return (T) new_node.data;
	}
	
	public boolean find(String key)
	{

		@SuppressWarnings("unchecked")
		Node<String> temp=head;
		while(temp!=null)
		{
			if(temp.data.compareTo(key)==0)
			return true;
			temp=temp.next;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T search(String key)
	{
		Node<String> temp=head;
		@SuppressWarnings("rawtypes")
		Node prev_node=head;
		
		while(temp.data.compareTo(key)!=0)
		{
			
			temp = temp.next;
			
		}
		
		while(prev_node.next != temp)
		{
			
			prev_node = prev_node.next;
		}
		prev_node.next=temp.next; 
		temp.next=null;
		return null;
	
	}
	@SuppressWarnings("unchecked")
	public void add(T data)
	{
		@SuppressWarnings("rawtypes")
		Node temp = new Node(data);
		
		if(head==null)
		{
			head = temp;
		}
		else
		{
			@SuppressWarnings("rawtypes")
			Node p;
			p = head;
			while(p.next != null)
			{
				p = p.next;
				
			}
			p.next = temp;
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	public T print()
	{
		Node temp=head;
		
		while(temp!=null)
		{	
			System.out.println(temp.data);
			temp=temp.next;	
		}
		return null;
		
	}
	public void displayList()
	{
		@SuppressWarnings("rawtypes")
		Node temp;
			temp =head;
			while(temp!= null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
	}
	
}
