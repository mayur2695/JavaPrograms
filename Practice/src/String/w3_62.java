package String;

public class w3_62 
{
	public static void main(String[] args) 
	{
		String s="abbadcababd000";
		char a[]=s.toCharArray();
		int b[]=new int[256];
		for (int i = 0; i < a.length; i++)
		{
			b[a[i]]++;
			
		}
		String s1="";
		for (int i = 0; i < b.length; i++) 
		{
			if(b[i]!=0)
			{
				s1=s1+((char)(i))+ b[i];
			}
			
		}
		System.out.println(s1);
		
	}

}
