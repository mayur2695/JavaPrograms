package Array;

public class A8
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int n=1;
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==n)
			{
				count++;
				break;
			}
			
		}
		System.out.println(count);
		int b[]=new int[a.length-count];
		count=0;
		
		for (int i = 0; i < a.length; i++)
		{
			boolean flag=false;
				if(a[i]==n)
				{
					flag=true;
				}
			if(!flag)
			{
				b[count++]=a[i];
			}
			
		}
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
			
		}
		
	}

}
