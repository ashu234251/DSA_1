package in.controller;

import java.util.ArrayList;

public class Problem2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer>a1=new ArrayList<Integer>();
		int[]Arr= {3,2,2,3,4,5,6,7,3,3,6};
		int val=3;
		int count=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]!=val)
			    a1.add(Arr[i]);
			else
				count++;
		}
		System.out.println("Value of k is: "+a1.size());
		System.out.println("Nums is: "+a1);
		
	}

}
