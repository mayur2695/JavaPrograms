package Array;

public class Rating 
{
	String app; 
	int rating;
	public Rating(String app, int rating) {
		super();
		this.app = app;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Rating [app=" + app + ", rating=" + rating + "]";
	}
	
	

}
