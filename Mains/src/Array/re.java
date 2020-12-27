package Array;

public class re 
{
	
	static int a[]= {3,7,4,6,8,5,1,2,4,5,6,8,9};
	static int i=0;
	static int j=0;
	static int imax=a.length-1;
	static int jmax=a.length-1;
	static int count=1;
	public static void main(String[] args)
	{
		sort();
		for(int p:a)
			System.out.print(p+" ");
		
	}

	private static void sort() 
	{
		if(a[i]>a[j] && i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		if(i<imax || j<jmax)
		{
			i=count/(jmax+1);
			j=count%(jmax+1);
			count++;
			sort();
		}
		
		
	}

}
