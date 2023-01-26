package string21jan;

import java.util.Scanner;

public class TrimWithoutMethod {

	public static void main(String[] args) {
		 String str, 
		 newstr="";
	      char ch;
	      int len, i;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Enter the String: ");
	      str = scan.nextLine();
	      
	      len = str.length();
	      for(i=0; i<len; i++)
	      {
	         ch = str.charAt(i);
	         
	         if(ch!=' ')
	            newstr = newstr + ch;
	      }
	      
	      str = newstr;
	      System.out.println("\nString without Spaces = " +str);
	   }
	}