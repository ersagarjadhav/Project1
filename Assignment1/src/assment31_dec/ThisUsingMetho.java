package assment31_dec;

public class ThisUsingMetho {

	
	void option1()
	{
		System.out.println("this is method on1");
	}
	void option2()
	{
		System.out.println("this is option 2");
		this.option1();
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisUsingMetho obj=new ThisUsingMetho();
		obj.option2();
		
		
	}

}
