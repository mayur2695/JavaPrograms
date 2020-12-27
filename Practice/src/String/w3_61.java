package String;

public class w3_61 
{
	public static void main(String[] args) 
	{
		String s="Welcome";
		int n=5;
		int i=0;
		int j=s.length()-n;
		String s1="";
		String s2="";
		while(i<n)
		{
			s1=s1+s.charAt(i);
			s2=s2+s.charAt(j);
			i++;
			j++;
		}
		
		System.out.println(s1+s2);
	}

}
