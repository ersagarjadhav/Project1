package assment31_dec;

public class Cycle {

	  int accountNo;
	    int noOfWheels;
	
	    Cycle()
	    {
	    	
	    	System.out.println("this is default constructor");
	    	
	    }
	  
	
	   Cycle(int accountNo, int noOfWheels)
	   {      
		   this();
	   
	    System.out.println("i am another constructor");
	   this.accountNo=accountNo;
	   this.noOfWheels=noOfWheels;
		   
		   
	   }
	
	void display()
	{
		System.out.println("Account no is"+accountNo);
		System.out.println("No of Wheels is"+noOfWheels);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle obj=new Cycle(121,1);
		//Cycle obj1=new Cycle();
		obj.display();
		//obj1.display();
		
		
		
		
		
		

	}

}
