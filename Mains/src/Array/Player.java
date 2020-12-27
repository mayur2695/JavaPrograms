package Array;


public class Player 
{
	static int a[]= {1,2,3,4,5,1,2,3,4,6,7};
	static int count=0;
	static int bindex=0;
	
	public static void main(String[] args)
	{
		findsum(0,1);
		int b[]=new int[a.length-count];
		remove(b,0);
		print(b,0);
		
		
		
	}
	private static void print(int[] b, int i) {
		System.out.print(b[i]+" ");
		if(i<b.length-1)
			print(b, ++i);
		
	}
	private static void remove(int[] b, int i)
	{
		boolean flag=false;
		for (int j = 0; j < b.length; j++)
		{
			if(b[j]==a[i])
			{
				flag=true;
			}
			
		}
		if(!flag)
		{
			b[bindex++]=a[i];
		}
		if(i<a.length-1)
		{
			remove(b, ++i);
		}
		
		
	}
	private static void findsum(int i,int j) 
	{
		if(i<a.length && j<a.length)
		{
			if(a[i]==a[j])
			{
				count++;
				findsum(++i,i+1);
			}
			else if(j==a.length-1)
			{
				findsum(++i,i+1);
			}
			else
			{
				findsum(i, ++j);
			}
			

			
		}
		
		
			
	}
		
		
		
}	

