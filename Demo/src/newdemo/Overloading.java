package newdemo;

public class Overloading {
	
	
	int sum(int a,int b)
	{
		return a+b;
	}
	
	int  sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Overloading obj=new Overloading();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 30,20));

	}

}
