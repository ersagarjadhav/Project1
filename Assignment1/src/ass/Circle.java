package ass;
//Write a Java program to enter radius of a circle and find its diameter,circumference and area.
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi=3.14;
		int r=20;
		 
		int diameter=2*r;
		
		System.out.println("the Diameter of Circle is "+diameter);

		double circumference=2*pi*r;
		
		System.out.println("The Circumference of circle is "+circumference);
		
		double area=pi*r*r;
		
		System.out.println("The area of circle is "+area);
	}

}
