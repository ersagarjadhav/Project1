package assignment4;

import java.util.Scanner;

public class LeapYearUsingTernery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int year;
      System.out.println("Enter the year");
      year=sc.nextInt();
      
      String check=((year%4==0&&year%100!=0))||(year%400==0)?"Leap Year":"Not Leap Year";
      
      System.out.println(check);
	}

}
