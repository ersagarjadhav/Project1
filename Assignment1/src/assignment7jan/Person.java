package assignment7jan;

public class Person {
	
	private String name;
   private char gender;
   private int age;
   
   public void setname(String name)
	{
		this.name=name;
	}
	
	public String getname()
	{
		return name;
		
	}
   
   public void setgender(char gender)
   {
	   this.gender=gender;
   }   
   public char getgender()
   {
	   return gender;
   }
   
   
   
   
   public void setage(int age)
   {
	   this.age=age;
   }
   public int getage()
   {
	   return age;
   }

}
