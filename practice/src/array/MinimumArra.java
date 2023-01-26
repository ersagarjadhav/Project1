package array;

import java.util.Scanner;

public class MinimumArra {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter the array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("The minimum value is" +min);
		
		
	}

}
