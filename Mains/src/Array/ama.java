package Array;

public class ama 
{
	static int[] a= {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) 
	{
		int k=4;
		int m=1;
		while(m<=k)
		{
			int[] b=new int[m];
			int n=m;
			while(m==n)
			{
				int sum=0;
				for (int i = 0; i < b.length; i++)
				{
					sum=sum+a[b[i]];
					
				}
				if(sum==k)
				{
					for (int i = 0; i < b.length; i++)
					{
						
						System.out.print(a[b[i]]+" ");
					}
					System.out.println();
				}
				if(Isbull(b))
				{
					m++;
				}
				else
				{
					b=addoneinb(b,b.length-1);
				}
			}
		}
		
		
		}
	
	private static int[] addoneinb(int[] b, int i) {
		if(b[i]<a.length-1)
		{
			b[i]++;
			return b;
		}
		else
		{
			b[i]=0;
			return addoneinb(b, --i);
		}
	}

	private static boolean Isbull(int[] b)
	{
		boolean flag=true;
		for (int i = 0; i < b.length; i++)
		{
			
			if(b[i]!=a.length-1)
			{
				flag=false;
			}
		}
		return flag;
	}


}
