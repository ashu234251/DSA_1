package in.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 
{
	 static void findPair(int[] arr, int target)
	  {
	    Map<Integer,Integer> hm=new HashMap<>();
	    for(int i=0;i<arr.length;i++)
	    {
	      int temp= target-arr[i];
	      if(hm.containsKey(temp))
	      {
	       System.out.println(hm.get(temp)+" "+(i));
	       return;
	      }
	      hm.put(arr[i], i);
	    }
	    System.out.println("-1");
	  }
	  public static void main(String[] args)
	  {
	    int target=9;
	    int[] arr= {2,7,11,15};

	    findPair(arr,target);
	  }
}

