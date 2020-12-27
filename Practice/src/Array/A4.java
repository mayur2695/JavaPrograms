package Array;

public class A4 
{
	public static void main(String[] args) 
	{
int a[]= {-1,2,-4,-6,-34,12,-12,-67,90,-56};
		
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			if(a[i]<0 && a[j]>0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			else if(a[i]>0)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		
		
		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.print(a[j2]+" ");
			
		}
		
	}

}
