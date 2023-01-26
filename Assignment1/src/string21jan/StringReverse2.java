package string21jan;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) 
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		s=sc.next();
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		
		System.out.println("Reverse String is:"+sb);
		
	}

}