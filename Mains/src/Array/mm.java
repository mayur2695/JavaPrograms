package Array;

public class mm 
{
	static int a[]= {3,7,90,20,5,50,40};
	static int k=3;
	public static void main(String[] args) 
	{
		
		int min=Integer.MAX_VALUE;
		int minindex=0;
		for (int i = 0; i <= a.length-k; i++)
		{
			int sum=0;
			
			sum=findsub(i,k);
			System.out.println(sum);
			if(sum<min)
			{
				min=sum;
				minindex=i;
			}
		}
		System.out.println("min average is "+min/k);
		System.out.println(minindex);
	}
	private static int findsub(int i,int k) 
	{
		if(k==0)
		{
			return 0;
		}
		else
		{
			return a[i]+findsub(i+1,k-1);
		}
		
		
	}

}
