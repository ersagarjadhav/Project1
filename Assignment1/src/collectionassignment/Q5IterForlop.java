package collectionassignment;

import java.util.ArrayList;

public class Q5IterForlop {

	public static void main(String[] args) {
     ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add("Pune");
		al.add("Nagpur");
		al.add("Mumbai");
		
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.println(al.get(i));
		}
	}

}