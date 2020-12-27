package Array;

public class fhg
{
	public static void main(String[] args) 
	{
		int []a= {4,2,8,1,6};
		int []b= {5,7,9,3};
		
		for (int i = 0; i <a.length+b.length; i++)
		{
			for (int j = 0; j < a.length+b.length; j++)
			{
				if(i<j)
				{
					int ie=0;	
					int je=0;
					if(i<a.length)
						ie=a[i];
					else
						ie=b[i-a.length];
					if(j<a.length)
						je=a[j];
					else
						je=b[j-a.length];
					if(ie>je)
					{
						if(i<a.length && j<a.length)
						{
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
							
						}
						else if(i>=a.length && j<a.length)
						{
							int temp=b[i-a.length];
							b[i-a.length]=a[j];
							a[j]=temp;
							
						}
						else if(i<a.length && j>=a.length)
						{
							int temp=a[i];
							a[i]=b[j-a.length];
							b[j-a.length]=temp;
							
						}
						else
						{
							int temp=b[i-a.length];
							b[i-a.length]=b[j-a.length];
							b[j-a.length]=temp;
						}
					}
				}
				
			}
			
		}
		
		for(int p:a)
			System.out.print(p+" ");
		System.out.println();
		for(int p:b)
			System.out.print(p+" ");
		
		
	}

}
