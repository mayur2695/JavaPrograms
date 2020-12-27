package Array;
//find all divisor from 1 to n.
public class program3 
{
	
	public static void main(String[] args) 
	{
		int n=5;
		for (int i = 1; i <=n ; i++)
		{
			
			int sum=givesum(i,n);
			System.out.println(sum);
			
		}
		
	}

	private static int givesum(int i, int n) {
		int sum=0;
		for (int j = 1; j <=n; j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		
		}
		return sum;
		
	}
		
}
	
