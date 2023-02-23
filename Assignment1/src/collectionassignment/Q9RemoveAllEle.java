package collectionassignment;

import java.util.ArrayList;

public class Q9RemoveAllEle {

	public static void main(String[] args) {
       ArrayList al = new ArrayList();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
	
		al.removeAll(al);
		
		System.out.println(al);
	}

}
