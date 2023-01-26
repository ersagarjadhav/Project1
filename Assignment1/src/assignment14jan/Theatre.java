package assignment14jan;

import java.util.Scanner;

public class Theatre {

	int theatre_id;
	String theatre_name;
	String theatre_location;
	Movie m;

	public Theatre(int theatre_id, String theatre_name, String theatre_location, Movie m) {
		super();
		this.theatre_id = theatre_id;
		this.theatre_name = theatre_name;
		this.theatre_location = theatre_location;
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [theatre_id=" + theatre_id + ", theatre_name=" + theatre_name + ", theatre_location="
				+ theatre_location + ", m=" + m + "]";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Theatre t[] = new Theatre[2];
		for (int i = 0; i < t.length; i++) {
			System.out.println(" Enter Theatre Id : ");
			int theatre_id = in.nextInt();
			System.out.println(" Enter Theatre Name : ");
			String theatre_name = in.next();
			System.out.println(" Enter Theatre Location : ");
			String theatre_location = in.next();
			System.out.println(" Enter Movie Id : ");
			int movie_id = in.nextInt();
			System.out.println(" Enter Movie Name : ");
			String movie_name = in.next();
			System.out.println(" Enter rating  : ");
			double rating = in.nextDouble();

			Movie m = new Movie(movie_id, movie_name, rating);
			t[i] = new Theatre(theatre_id, theatre_name, theatre_location, m);
		}
		for (int i = 0; i < t.length; i++) 
		{
			for(int j=i+1;j<t.length;j++)
			{
			if(t[i].m.rating<t[i+1].m.rating)
			{
				double temp=t[i].m.rating;
				t[i].m.rating=t[j].m.rating;
				t[j].m.rating=temp;
			}
			}
			System.out.println(" " + t[i]);
		}
	}
}