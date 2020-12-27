package Array;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class fg 
{
	
	public static void main(String[] args) 
	{
		aaa r=new aaa();
		
		String s="gmail 2,facebook 3,gmail 4,facebook 5,gmail 7";
		String s1[]=s.split(",");
		for (int i = 0; i < s1.length; i++)
		{
			String s2=s1[i];
			String s3[]=s2.split(" ");
			r.putrating(s3[0], Integer.parseInt(s3[1]));
			
			
			
		}
		
		Set<String> apname=new HashSet<>();
		
		for (int i = 0; i < r.list.size(); i++) 
		{
			apname.add(r.list.get(i).app);
			
		}
		DecimalFormat d=new DecimalFormat("##.00");

		Iterator<String> it=apname.iterator();
		while(it.hasNext())
		{
			String sapp=it.next();
			System.out.println(sapp+" "+d.format(r.getaverageratig(sapp))+" "+r.getratingcount(sapp));
		}
	}

}
