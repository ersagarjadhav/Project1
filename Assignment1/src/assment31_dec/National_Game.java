package assment31_dec;

import java.util.Scanner;

public class National_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the country Name");
		String name=sc.next();
		
		
		switch (name)
		{
			case "india":
			System.out.println("National game of india is hockey");
			break;
				
			case "china":
				System.out.println("National game of china is TableTennis");
			    break;
			    
			case "Bangladesh":
				System.out.println("National game of Bangladesh is kabbadi");
			break;
			
			case "Itely":
				System.out.println("National game of Itely is foodball");
			break;
			
			case "United states":
				System.out.println("National game of United states is baseball");
			
			break;
			
			default:
				System.out.println("please enter the valid country name");
				break;
		}
		

	}

}
