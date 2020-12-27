package Array;

public class A9 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int count=0,cnt1=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			else
			{
				cnt1++;
			}
			
		}
		System.out.println(count);
		System.out.println(cnt1);
		int[] even=new int[count];
		int[] odd=new int[cnt1];
		count=0;
		cnt1=0;
		for (int i = 0; i < a.length; i++)
		{
			
			if(a[i]%2==0)
			{
				even[count++]=a[i];
			}
			else
			{
				odd[cnt1++]=a[i];
			}
		}
		for (int i = 0; i < odd.length; i++)
		{
			
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < even.length; i++)
		{
			System.out.print(even[i]+" ");
			
		}

		
		
		
		
		
	}

}
