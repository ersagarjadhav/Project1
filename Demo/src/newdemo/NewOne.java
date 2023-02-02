package newdemo;

import java.util.Arrays;
import java.util.Scanner;

public class NewOne {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String a=sc.next();
		
		System.out.println("Enter the second string");
		String b=sc.next();
		
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		if(a.length()==b.length())
		{
			char[] charArray1=a.toCharArray();
			char[] charArray2=b.toCharArray();		
		
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result=Arrays.equals(charArray1,charArray2);
			
			if(result)
			{
				System.out.println(a+" "+b+"Is anagram");
			}
			else
			{
				System.out.println(a+" "+b+" Is not anagram");
				
			}
		
		}
		
		
	}

}
