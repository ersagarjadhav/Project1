package book;

public class Book {

	int b_id;
	String b_name;
	float price;
	public Book(int b_id, String b_name, float price) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.price = price;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", price=" + price + "]";
	}
	

}
