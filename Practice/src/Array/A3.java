package Array;

public class A3 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,4,9,5,3,8,7,10,12,14};
		
		
		if(a[0]>a[1])
		{
			int temp=a[0];
			a[0]=a[1];
			a[1]=temp;
		}
		
		for(int i=1;i<a.length;i+=2)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j] && a[i]>a[i-1])
				{
					break;
				}
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(int p:a)
		{
			System.out.print(p+" ");
		}
		
	}

}
