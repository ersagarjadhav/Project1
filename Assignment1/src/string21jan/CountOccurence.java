package string21jan;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		String strArray[] = str.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			int count=0;
			for(int j=0;j<strArray.length;j++) {
				
				String temp1 = strArray[i];
				String temp2 = strArray[j];
				
				
				if(j<i && temp1.equals(temp2)) {
					break;
				}
				
				if(temp1.equals(temp2)) {
					count++;
				}
				
				
				if(j==strArray.length-1) {
					System.out.println(strArray[i]+" "+count);
				}
			}
		}
	}
}