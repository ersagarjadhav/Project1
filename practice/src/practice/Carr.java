package practice;

public class Carr {
	
	String manufact_name;
	String car_name;
	String car_color;
	double car_price;
	
	
	Carr(String m,String cn,String cc,double cp)
	{
		manufact_name=m;
		car_name=cn;
		car_color=cc;
		car_price=cp;
	}
	
	
	void display()
	{
		System.out.println("The car manufacture name is " +manufact_name);
		System.out.println("The car name is" +car_name);
		System.out.println("The Car color is" +car_color);
		System.out.println("The car price is " +car_price);
		
	}
	
	
	double get_price()
	{
		return car_price;
	}
	
	

}
