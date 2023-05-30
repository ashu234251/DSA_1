package in.controller;

public class Problem6 
{

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(true);
					System.exit(0);
				}
			}
		}
		System.out.println(false);
	}

}
