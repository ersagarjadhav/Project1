package assingment5;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pizza;
		int puffs;
		int colddrinks;
		float bill;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bill Details");
		
		System.out.println("Enter the quantity of pizza");
		 pizza=sc.nextInt();
		 
		 System.out.println("Enter the quantity of puffs");
		 puffs=sc.nextInt();
		 
		 System.out.println("Enter the quantity of coldrinks");
		 colddrinks=sc.nextInt();
				
	      bill=(pizza*100)+(puffs*20)+(colddrinks*10);	
		 
		 System.out.println("Total Price"+bill);
		 
		 System.out.println(" ENJOY THE SHOW!!! ");
		 

	}

}
