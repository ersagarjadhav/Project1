package assignment7jan;


class IPLTeam
{
	void play()
	{
		System.out.println("Ipl team play method");
	}

}

class Csk extends IPLTeam
{
	 void play()
	 {
		 super.play();
		 System.out.println("csk team play");
	 }
  
}


class Rcb extends Csk
{
	
   void play()
   {
	   super.play();
	   System.out.println("Rcb play method");
	  
   }
   
}




public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rcb obj=new Rcb();
		 obj.play();

	}

}
