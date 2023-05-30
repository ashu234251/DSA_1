package in.controller;

public class Problem8 
{
	public static void main(String[] args) 
	{
		int[]nums= {1,2,3,4,5,5};
		int n=nums.length;
		int missing=0;
		int repeat=0;
	    for(int i=1;i<=n;i++)
	    {
	    	int flag=0;
	    	for(int j=0;j<n;j++)
	    	{
	    	   if(nums[j]==i)
	    	   {
	    		   flag=1;
	    		   break;
	    	   }
	    	}
	    	if(flag==0)
	    	{
	    		missing=i;
	    		break;
	    	}
	    }
	    for(int i=0;i<nums.length;i++)
	    {
	    	for(int j=0;j<nums.length;j++)
	    	{
	    		if(nums[i]==nums[j] && i!=j)
	    			repeat=nums[i];
	    	}
	    }
	    
	    int[]output= {repeat,missing};
	    System.out.println("Repeated: "+output[0]+" Missing: "+output[1]);
	}

}
