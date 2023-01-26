package assignment3;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		
		int nummber;
		
		Scanner sc=new Scanner(System.in);
				
	  System.out.println("Enter the number");			
	   nummber=sc.nextInt();
	   
	   while(nummber>0)
	   {
		   nummber=nummber/10;
		   count++;
	   }
		
	   System.out.println("Number of digits:"+count);
		
	}

}
