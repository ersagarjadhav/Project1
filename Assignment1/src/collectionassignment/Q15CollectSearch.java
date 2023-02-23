package collectionassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q15CollectSearch {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(53);
		al2.add(68);
		al2.add(82);
		
		al.addAll(al2);
		
		System.out.println(al);
		
		if(al.containsAll(al2))
		{
			System.out.println("Entire Collection is present");
		}
		else
		{
			System.out.println("Entire Collection is not present");
		}
		
		al.remove(6);
		
		System.out.println(al);
		
		if(al.containsAll(al2))
		{
			System.out.println("Entire Collection is present");
		}
		else
		{
			System.out.println("Entire Collection is not present");
		}
	}

}