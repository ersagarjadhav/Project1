package string21jan;

import java.util.Scanner;

public class SecondOccurence {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	      System.out.print("Enter String: ");
	      String str = scan.nextLine();
	      System.out.print("Enter a character: ");
	      char ch = scan.next().charAt(0);

	      int index = str.indexOf(ch, str.indexOf(ch)+1 );

	      System.out.println("Index of the second occurrence of " 
	                         + " character \'" + ch + "\' is: "+ index);
	      scan.close();
	   }
	}