package in.controller;

public class Problem5 
{
	public static void main(String[] args) 
	{
			int[]nums1 = {1,2,3,0,0,0};
			int[]nums2= {2,5,6};
			int m=3;
			int n=3;
	        int i=m-1; 
	        int j=n-1;
	        int k=nums1.length-1; 

	        while(j>=0)
	        {
	            if(i>=0 && nums1[i]>nums2[j])
	            {
	                nums1[k]=nums1[i];
	                k--; 
	                i--; 
	            }
	            else
	            {
	                nums1[k] = nums2[j];
	                k--; 
	                j--; 
	            }
	        }
	        for(int x=0;x<nums1.length;i++)
	        {
	        	System.out.print(nums1[x]+" ");
	        }
	}
}
