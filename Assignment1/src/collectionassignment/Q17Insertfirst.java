package collectionassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17Insertfirst {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
		
		System.out.println("Enter the element to be add");
		Integer i = sc.nextInt();
		
		al.add(0, i);
		
		System.out.println(al);
	}

}
