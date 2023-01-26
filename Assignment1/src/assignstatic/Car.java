package assignstatic;

public class Car {
	static String model="Thar";
	static int totalcarsold =24;

	public void new1(String m,int  cs)
	{
		model=m;
		totalcarsold=cs;
		display();
	}
	
	void display()
	{
		System.out.println(""+model);
		System.out.println(" "+totalcarsold);
	}
	
	
	
	public static void main(String[]args)
	{
	      Car.model="xuv300";
	      Car.totalcarsold=10;
	      Car obj=new Car();
	      obj.display();
	      
		
	}
}
