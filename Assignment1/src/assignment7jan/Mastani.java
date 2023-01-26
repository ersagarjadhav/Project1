package assignment7jan;

interface IceCream
{
	
  void eat();

}

interface Juice
{
   void drink();	
}



public class Mastani implements IceCream,Juice

{
	public void  eat()
	{
		System.out.println("Eat the Icecream");
	}
	public void  drink()
	{
		System.out.println("Drink the juice");
	}
	
	

	public static void main(String[] args) {

		Mastani obj=new Mastani();
		obj.eat();
		obj.drink();
		
	}

}
