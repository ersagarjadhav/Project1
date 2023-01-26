package practice;

public class PrintNumber {
	
	
	
	
	PrintNumber()
	{
		System.out.println("Default constructor is called");
	}
	
	
	void check(int age)
	{
		
		if(age>10)
		{
			display("Eligible to vote");
		}
	}
	
	void display(String msg)
	{
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		PrintNumber obj=new PrintNumber();
		obj.check(18);

		
		
		
	}

}
