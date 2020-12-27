package Array;

public class A6 
{
	public static void main(String[] args) 
	{
		int a[]= {1,1,2};
		
		// remove duplicate
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
				
			}
			
		}
		System.out.println(cnt);
		int b[]=new int[a.length-cnt];
		cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag=false;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				b[cnt++]=a[i];
			}
			
		}
		
		int count=0;
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				
				System.out.println(b[i]+ " " + b[j]);
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
	}

}
