package Array;

public class A1 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int i=0;
		do
		{
			sum+=a[i];
			i++;
		}while(i<a.length);
		System.out.println(sum);
		
	}

}
