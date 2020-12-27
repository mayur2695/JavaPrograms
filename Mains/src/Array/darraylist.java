package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class darraylist 
{
	public static void main(String[] args) 
	{
		
		List<ArrayList<Integer>> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("value of i");
		int i=sc.nextInt();
		System.out.println("value of j");
		int j=sc.nextInt();
		for (int p = 0; p < i ; p++)
		{
			list.add(new ArrayList<>());
			for (int k = 0; k < j; k++)
			{
				int e=sc.nextInt();
				list.get(p).add(e);
			}
			
		}
		for (int k = 0; k < list.size(); k++)
		{
			for (int k2 = 0; k2 < list.get(k).size(); k2++)
			{
				if(k+k2==2 || k2==k)
				{
					System.out.print(list.get(k).get(k2)+" ");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}

}
