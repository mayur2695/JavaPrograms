package String;

public class team_fight 
{
	public static void main(String[] args)
	{
		int a[]= {4,3,1,2,0};
		int max=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(max<=a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		max=max*max;
		
		int count=0;
		while(max!=0)
		{
			max=max/10;
			count++;
		}
		System.out.println(count);
		int mlt=(int) Math.pow(10, count);
		System.out.println(mlt);
		
	}

}
