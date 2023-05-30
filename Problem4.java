package in.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>a1=new ArrayList<Integer>();
		System.out.print("Enter Number of digits in the number: ");
		int n=scan.nextInt();
		System.out.println("Enter n digits: ");
		for(int i=0;i<n;i++)
		{
			int temp=scan.nextInt();
			a1.add(temp);
		}
		//int[]digits= {1,2,3};
	    //int i = digits.length - 1;
		int i=a1.size()-1;

		
        while (i >=0 && a1.get(i)==9) 
        {
            i --;
        }
        

        if (i == -1) 
        {
        	ArrayList<Integer>a2=new ArrayList<Integer>();
        	a2.add(1);
        	int t=a1.size();
        	while(t-- >0)
        	{
        		a2.add(0);
        	}
            System.out.println(a2);
            System.exit(0);
        }
        

        ArrayList<Integer>a2=new ArrayList<Integer>();
        for (int j = 0; j < i; j ++) 
        {
        	a2.add(a1.get(j));
        }
        a2.add(a1.get(i)+1);
        for(int j=i+1;j<a1.size();j++)
        {
        	a2.add(0);
        }
        System.out.println(a2);
	}

}
