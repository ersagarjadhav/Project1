package linkedlist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Q6_Onlykeys {

	public static void main(String[] args) {
HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		hm.put(1234, "Sagar");
		hm.put(2345, "Ram");
		hm.put(3456, "Virat");
		hm.put(4567, "Dhoni");
		hm.put(5678, "Sachin");
		
  Set<Integer> set=hm.keySet();
  
		
		Iterator<Integer> it=set.iterator();
		
	while(it.hasNext())
		{
			long l=it.next();
			System.out.println(l);
			
		
		
		

	}

	}
}

