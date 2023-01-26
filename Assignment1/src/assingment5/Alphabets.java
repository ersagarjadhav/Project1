package assingment5;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		char c1,c2,c3,c4,c5,c6,c7;
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter the first letter:");
	        c1=sc.next().charAt(0);
	        
	        System.out.println("Enter the second letter:");
	        c2=sc.next().charAt(0);
	        
	        System.out.println("Enter the third letter:");
	        c3=sc.next().charAt(0);
	        
	        System.out.println("Enter the fourth letter:");
	        c4=sc.next().charAt(0);
	        
	        System.out.println("Enter the fifth letter:");
	        c5=sc.next().charAt(0);
	        
	        System.out.println("Enter the sixth letter:");
	        c6=sc.next().charAt(0);
	        
	        System.out.println("Enter the seventh letter:");
	        c7=sc.next().charAt(0);
	        
	        if(c1=='R'||c1=='r' && c2=='A'||c2=='a' && c3=='I'||c3=='i' && c4=='N'||c4=='n' && c5=='B'||c5=='b' && c6=='O'||c6=='o' && c7=='W'||c7=='w')
	        
	        {
	            System.out.println("RAINBOW");
	        }
	        else
	            System.out.println("The spelling is wrong");
	    }
	}