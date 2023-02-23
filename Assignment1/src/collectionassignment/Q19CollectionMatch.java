package collectionassignment;

import java.util.ArrayList;

public class Q19CollectionMatch {

	public static void main(String[] args) {
   ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(15);
		al2.add(20);
		al2.add(36);
		al2.add(45);
		
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		al.remove(7);
		
		if(al.containsAll(al2))
		{
			System.out.println("Both collections are equal");
		}
		else
		{
			System.out.println("collections are different");
		}
	}

}
