package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q4Arriterator {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add("Nashik");
		al.add("Mumbai");
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
