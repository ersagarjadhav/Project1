package practice;

import java.util.Scanner;

public class Paytm 
{

	
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		      User obj=new User("sagar","Pune",5555,550);
		     
		      obj.print();
		      
		      System.out.println("Enter the coupen code");
		      
				String s=sc.next();
				
		         int p=obj.getPrice();
	          
	          
	          if(s.equals("gold"))
	          {
	        	  p=p-50;
	        	  
	        	  System.out.println("Price after discount"+p);
	          }
	          else if(s.equals("silver"))
	          {
	        	  p=p-30; 
	        	  
	        	  System.out.println("Price after discount"+p);
	        	  
	          }
	          else
	          {
	        	  System.out.println("Price is....."+p);
	          }
	          
	          
	 	}
	
}
