package Array;

public class A7 
{
	static int a[]= {10,20,30,40,50};
	static int top=a.length-1;
	public static void main(String[] args) 
	{
		
		
		pop();
		push(50);
		System.out.println(top);
		for(int p:a)
		{
			System.out.print(p+" ");
		}
		
	}

	private static void push(int i) 
	{
		if(top==a.length-1)
		{
			System.out.println("cant push");
		}
		else
		{
			top++;
			a[top]=i;
			
		}
		
		
	}

	private static void pop()
	{
		if(top<0)
		{
			System.out.println("cant pop");
		}
		else
		{
			a[top]=0;
			top--;
		}
		
		
	}

}
