package Array;

import java.util.Scanner;

public class mmm 
{
	static void solve(double meal_cost, int tip_percent, int tax_percent) 
	    {
	        double tip=((meal_cost/100)*(double)tip_percent);
	        double d=((double)tax_percent/100);
	        System.out.println(d);
	        double tax=(d*(double)tip_percent);
	        System.out.println(tip);
	        System.out.println(tax);
	        double total_cost=meal_cost+tip+tax;
	        System.out.println((int) total_cost);


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args)
	    {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	    }
	}
		

