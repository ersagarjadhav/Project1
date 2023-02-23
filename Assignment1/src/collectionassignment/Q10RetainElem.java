package collectionassignment;

import java.util.ArrayList;

public class Q10RetainElem {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
		
		al.add(23);
		al.add(43);
		al.add(78);
		al.add(98);
		
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		
		al2.add(54);
		al2.add(76);
		
		al.addAll(al2);
		
		System.out.println(al);
	
		al.retainAll(al2);
		
		System.out.println(al);
	}

}

