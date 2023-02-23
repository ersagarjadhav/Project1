package collectionassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q16RetriveElement {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
		
		System.out.println("Enter index of element to be retrived");
		Integer i = sc.nextInt();
		
		System.out.println("Element at index " + i + " is : "+al.get(i));
	}

}
