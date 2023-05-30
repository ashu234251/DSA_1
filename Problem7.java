package in.controller;

public class Problem7 
{
	public static void main(String[] args) 
	{
		int[]nums= {0,1,0,3,12,0};
		int i=0,j=nums.length-1;
		while(i+1<j)
		{
			if(nums[i]==0)
			{
				for(int k=i;k<j;k++)
				{
					nums[k]=nums[k+1];
				}
				nums[j]=0;
				j--;
			}
			else
				i++;
		}
		for(int x=0;x<nums.length;x++)
		{
			System.out.print(nums[x]+" ");
		}
	}

}
