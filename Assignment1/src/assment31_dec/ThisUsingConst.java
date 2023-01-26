package assment31_dec;

public class ThisUsingConst {

	int car_n;
	String car_name;
	double car_price;
	
	
	ThisUsingConst(int car_n,String car_name,float car_price)
	{
		this.car_n=car_n;
		this.car_name=car_name;
		this.car_price=car_price;
    }
	void display()
	{
		
		System.out.println("the car no is"+car_n);
		System.out.println("the car name is "+car_name);
		System.out.println("the car price is"+car_price);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ThisUsingConst obj=new ThisUsingConst(123,"Maruti",500000);
	obj.display();

	}

}
