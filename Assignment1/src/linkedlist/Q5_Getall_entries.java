package linkedlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Q5_Getall_entries {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "ABC");
		hm.put(3, "XYZ");
		hm.put(2, "IJK");
		hm.put(4, "PQR");
		
		Collection<String>c= hm.values();
	Iterator it=c.iterator();
	while(it.hasNext())
	{
		System.out.println(it.hasNext());
	}
		

	}

}
