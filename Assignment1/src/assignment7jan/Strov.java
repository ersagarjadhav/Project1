package assignment7jan;



interface Cake
{
	void bake();
   
}


class Strobeery implements Cake
{

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("strobeery flaverd cake");
	}
	

}
class Chocalate implements Cake
{

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Chocalate flaverd cake");
	}
	

}



public class Strov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cake c;
		c=new Strobeery();
		  c.bake();
		c=new Chocalate();
		c.bake();
		   
	}

}
