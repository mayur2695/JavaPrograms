package Array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class aaa implements RatingCollector 
{
	
	List<Rating> list=new ArrayList<Rating>();

	@Override
	public void putrating(String app, int rating)
	{
		list.add(new Rating(app, rating));
	}

	@Override
	public double getaverageratig(String app1) 
	{
		double sum=0;
		int count=0;
		double avg=0;
		for (int i = 0; i < list.size(); i++)
		{
			
			if(app1.compareToIgnoreCase(list.get(i).app)==0)
			{
				count++;
				sum=sum+list.get(i).rating;
			
			}
			
			
		}
		avg=sum/count;
		return avg;
			
	}

	@Override
	public int getratingcount(String app)
	{
		int count=0;
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.get(i).app.equals(app))
			{
				count++;
			}
			
		}
		
		return count;
		
	}
	

}
