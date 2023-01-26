package string21jan;

import java.util.Scanner;

public class TrimWhiteSpace {

	public static void main(String[] args) {
		{
		      String str;
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("Enter the String: ");
		      str = scan.nextLine();
		      
		      str = str.replaceAll(" ", "");
		      
		      System.out.println("\nString without Spaces = " +str);
		   }
		}
}