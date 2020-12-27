package Array;

public class A2 
{
	public static void main(String[] args) 
	{
		int a[]= {7,6,4,3,90,8,87,45,34,56,78};
		
		//sort the array 
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("Sorted Array");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//binary search
		int low=0;
		int high=a.length-1;
		int ele=34;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==ele)
			{
				System.out.println("element found at index "+mid);
				break;
			}
			else if(a[mid]>ele)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
	}

}
