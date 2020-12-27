package Array;

public class sss 
{
	
	public static void main(String[] args)
	{
		int a[]= {4,3,1,2,0};
		String s="";
		for (int i = 0; i < a.length; i++)
		{
			s=s+a[a[i]]*a[a[i]]+"*";
			
		}
		int si=0;
		int ei=0;
		int cnt=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='*')
			{
				ei=i;
				String s1=s.substring(si, ei);
				a[cnt++]=Integer.parseInt(s1);
				si=i+1;
			}
			
		}
		
		for(int p:a)
			System.out.print(p+" ");
	}

}
