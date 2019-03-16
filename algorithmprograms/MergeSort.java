/******************************************************************************************
 * 	@purpose      :  Merge Sort of list of Strings. 
 *  
 *  @author       :  B.Jagannath
 *  @version      : 1.0
 *  @since        : 13-03-2019
 ******************************************************************************************/

package com.bridgeit.algorithmprograms;

public class MergeSort 
{
	int[] array;
	int[] tempArray;
	int length;
	 
		//for sorting the given elements
	public static void merge(String[] names)
	{
		if(names.length>2)
		{
			String[] left= new String[names.length/2];
			String[] right=new String[names.length-names.length/2];
			for(int i=0;i<left.length;i++)
			{
				left[i]=names[i];
			}
			for(int i=0;i<right.length;i++)
			{
				right[i]=names[i+names.length/2];
			}
			merge(left);
			merge(right);
			sort(names,left,right);
		}
	}
	//for comparing, merging and to form a sequence
	public static void sort(String[] names,String[] left,String[] right)
	{
		int a=0;
		int b=0;
		for(int i=0;i<names.length;i++)
		{
			if(b>=right.length||(a<left.length && left[a].compareToIgnoreCase(right[b])<0))
			{
					names[i]=left[a];
					a++;
			}
			else
			{
				names[i]=right[b];
				b++;
			}
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			String[] s1={"devobs","j2ee","java","ecllipse","angular"};
			String[] s2={"javascript","php","react","html","python"};
			String[] names=new String[s1.length+s2.length];
			merge(s1);
			merge(s2);
			sort(names,s1,s2);
			merge(names);
			for(String s3: names)
			{
				System.out.println(s3);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("invalid data");
		}	
	}
}
