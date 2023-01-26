package array;

import java.util.Scanner;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		
		
		System.out.println("Enter the element in array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("The Array element is.....");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
