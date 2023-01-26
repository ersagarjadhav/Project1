package practice;

class Vehicle{

	 void engine(){

	System.out.println("This is vehicle engine");
	System.out.println("This is max speed");
	}
	
//	void Maxspeed()
//	{
//		System.out.println("this is max speed");
//	}
}

 class Bike extends Vehicle
	 {
     void engine()
     {
     System.out.println ("This is bike engine");
     System.out.println("The bike speed is 120");
}
     
//     void Maxspeed()
//     {
//    	 System.out.println("The bike speed is 120");
//     }
     
}

 class Car extends Vehicle
 {
 void engine()
 {
	  System.out.println ("this is car engine");
	  System.out.println("The Max Speed is 220");
}
 
// void Maxspeed()
// {
//	 System.out.println("The Max Speed is 220");
// }

	}


public class CodeExample {

	public static void main(String[] args) 
	{
    	Bike honda = new Bike ();
		honda.engine();
		Car benz = new Car ();
		benz.engine();

	}

}
