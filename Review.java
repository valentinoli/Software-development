
public class Review {
	
	private int rating;
	private String comment;

	public Review(int rating, String comment) {
		assert 0 <= rating && rating <= 5;
		this.rating = rating;
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public String getComment() {
		return comment;
	}	

}
