package assignment3;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(a+" * "+i+" = "+a*i);
		}
			
		
		
	}

}
