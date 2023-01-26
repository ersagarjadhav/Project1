package assment31_dec;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Area obj = new Area();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the side of square");
			int side = sc.nextInt();
			
			System.out.println("Enter the length of rectangle");
			int length = sc.nextInt();
			
			System.out.println("Enter the breadth of rectangle");
			int breadth = sc.nextInt();
			
			System.out.println("Square area is : "+obj.area1(side));
			System.out.println("Rectangle area is : "+obj.area1(length,breadth));
		}

	}
