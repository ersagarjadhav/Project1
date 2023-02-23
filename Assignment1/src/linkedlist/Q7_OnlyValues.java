package linkedlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Q7_OnlyValues {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
				
				hm.put(1234, "Sagar");
				hm.put(2345, "Ram");
				hm.put(3456, "Virat");
				hm.put(4567, "Dhoni");
				hm.put(5678, "Sachin");
				
				Collection<String>col=hm.values();
				Iterator <String>it=col.iterator();
				while(it.hasNext())
				{
					String s=it.next();
					System.out.println(s);
					
				}
				

			}

		}
