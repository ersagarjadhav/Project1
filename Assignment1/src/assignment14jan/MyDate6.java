package assignment14jan;

public class MyDate6 {
	int date;
	String month;
	int year;
	public MyDate6(int date, String month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate6 [date=" + date + ", month=" + month + ", year=" + year + "]";
	}

}
