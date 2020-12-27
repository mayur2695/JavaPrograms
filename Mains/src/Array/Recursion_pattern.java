package Array;

public class Recursion_pattern 
{
	static int i=0;
	static int j=0;
	static int imax=4;
	static int jmax=4;
	public static void main(String[] args) 
	{
		
		pattern();
		
		
		
	}

	private static void pattern() 
	{
		if(i+j<5)
			System.out.print("*");
		if(i<imax || j<jmax)
		{
			if(j<=jmax)
				j++;
			
			if(j>jmax)
			{
				System.out.println();
				j=0;
				i++;
			}
		pattern();
		}
		
		
	}

}
