package collectionassignment;

import java.util.ArrayList;

public class Q20CheckCollectionIsEmpty {

	public static void main(String[] args) {

   ArrayList al = new ArrayList();
		
		System.out.println(al.isEmpty());
		
		al.add(2);
		al.add(85);
		al.add(96);
		al.add(47);
		
		System.out.println(al);
		
		System.out.println(al.isEmpty());

	}

}
