package in.controller;

public class Problem3 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,3,5,6,8,9,11,15};
		int target=11;
		int l=-1,r=arr.length;
		int m;
		while(l+1<r)
		{
			m=l+(r-l)/2;
			if(predicate(arr[m],target)==0)
				l=m;
			else
				r=m;
		}
		System.out.println(r);
	}
	public static int predicate(int m,int target)
	{
		if(m<target)
			return 0;
		else
			return 1;
	}

}
