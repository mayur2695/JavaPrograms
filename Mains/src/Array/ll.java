package Array;

public class ll 
{
	static int arr1[]= {3,4,8,5,2};
	static int arr2[]= {3,4,9,8,2};
	public static void main(String[] args) 
	{
		index(0,1);
		for(int p:arr1)
				System.out.print(p+" ");
		
		
	}
	private static void index(int i,int j)
	{
		if(i<arr1.length-1)
		{
			if(arr1[i]>arr1[j])
			{
				int temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				index(++i, ++j);
			}
		}
		
		
	}
	
}
