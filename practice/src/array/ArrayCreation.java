package array;

import java.util.Scanner;

public class ArrayCreation 
{

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of element");
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("elements are:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
