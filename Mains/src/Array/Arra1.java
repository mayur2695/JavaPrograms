package Array;

public class Arra1
{
	static int arr1[]= {3,4,8,5,2};
	static int arr2[]= {3,4,9,8,2};
	static int index[]= {0,1};
	public static void main(String[] args) 
	{
		sorting(index);
		System.out.println();
		for(int p:arr1)
		{
			System.out.print(p+" ");
		}
		
		
		
		
	}
	private static void sorting(int[] index) 
	{
		System.out.println(index[0]+" "+index[1]);
		
		if(arr1[index[0]]>arr1[index[1]])
		{
			int temp=arr1[index[0]];
			arr1[index[0]]=arr1[index[1]];
			arr1[index[1]]=temp;
		}
		if(index[0]<arr1.length-1 || index[1]<arr1.length-1)
		{
			sorting(nextno(index));
		}
		
		
	}
	private static int[] nextno(int[] index) {
		if(index[1]<arr1.length-1)
		{
			index[1]++;
			return index;
		}
		else
		{
			index[0]++;
			if(index[1]!=arr1.length-1)
				index[1]=index[0]+1;
				
			return index;
		}
	}

}
