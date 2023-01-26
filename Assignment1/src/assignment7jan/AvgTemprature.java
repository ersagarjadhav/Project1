package assignment7jan;

import java.util.Scanner;

public class AvgTemprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		double []temprature=new double[7];
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter the temp of rainfall for day" +(i+1)+":");
			temprature[i]=sc.nextDouble();
			
		}
		
		double sum=0;
		for(double temprature1:temprature)
		{
			sum= sum+temprature1;
		}
		
		double avg=sum/temprature.length;
		
		System.out.println("Average temprature of rainfall is"+avg);
	}

}
