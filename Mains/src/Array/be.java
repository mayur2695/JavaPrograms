package Array;

public class be {
	static int a[]= {1,2,3,4,1,6,7,1,2,3};
	static int count=0;
	static int bindex=0;
	public static void main(String[] args) 
	{
		countdupli(0,1);
		int newa[]=new int[a.length-count];
		
			checkinnew(newa,0);
			printnew(newa,0);
		
	}
	private static void printnew(int[] newa, int i) {
		System.out.print(newa[i]+" ");
		if(i<newa.length-1)
			printnew(newa, ++i);
		
	}
	private static void checkinnew(int[] newa, int i)
	{
		Boolean flag=true;
		for (int k = 0; k < newa.length; k++) 
		{
			if(newa[k]==a[i])
			{
				flag=false;
			}
			
		}
		if(flag)
		{
			newa[bindex++]=a[i];
			
		}
		if(i<a.length-1)
		{
			checkinnew(newa,++i);
			
		}
		
		
		
	}
	private static void countdupli(int i,int j) {
		if(i<a.length && j<a.length)
		{
			if(a[i]==a[j])
			{
				count++;
				countdupli(++i,i+1);
			}
			
			else if(j==a.length-1)
			{
				countdupli(++i,i+1);
			}
			else
				countdupli(i,++j);
		}
		
	}

}
