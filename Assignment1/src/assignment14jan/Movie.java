package assignment14jan;

public class Movie {
	int movie_id;
	String movie_name;
	double rating;
	
	public Movie(int movie_id, String movie_name, double rating) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_name=" + movie_name + ", rating=" + rating + "]";
	}
	
	
}
