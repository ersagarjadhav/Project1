package assignment7jan;

import java.util.Scanner;

public class Course {
	
	int noOfCourse;
	
	public void courseDetail()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of course");
		noOfCourse=sc.nextInt();
		
		
		String arr[]=new String[noOfCourse];
		
		System.out.println("Enter the course name");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		
		System.out.println("Enter course to search");
		String search=sc.next();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(search))
			{
				System.out.println("Available course is"+search);
			}
		}
	}

}
