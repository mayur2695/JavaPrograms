package Array;

public class fghj 
{
	
	public static void main(String[] args) 
	{
		int a[][]= {{5,10},{0,20},{25,40},{35,45}};
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(min>a[i][j])
					min=a[i][j];
				if(max<a[i][j])
					max=a[i][j];
				
				
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		int maxv=Integer.MIN_VALUE;
		for (int time = min; time <= max; time++) 
		{
			int count=0;
			for (int i = 0; i < a.length; i++)
			{
				if(time>=a[i][0] && time<=a[i][1])
					count++;
				
			}
			if(maxv<count)
				maxv=count;
			
		}
		System.out.println(maxv);
		
	}
}
