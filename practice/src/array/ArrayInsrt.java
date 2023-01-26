package array;

import java.util.Scanner;

public class ArrayInsrt {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Size");
		int a=sc.nextInt();
		
		int arr[]=new int [a];
		
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Element are");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}

	}

}
