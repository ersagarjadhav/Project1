package feb18assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q3IterateMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map=new HashMap<>();
		map.put(10, "Sagar");
		map.put(12, "Mahesh");
		map.put(14, "Ashish");
		map.put(16, "vijay");
		map.put(18, "Ganesh");
		map.put(20, "Rohan");
		
		
		System.out.println("1. Iterating HashMap Using iterator to keyset.");
		Set<Integer> s=map.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
		{
			Integer k=i.next();
			System.out.print(" Key : "+k ); //for printing keys.
			System.out.print(" Value : "+map.get(k)+"\n");//for printing values.
		}
		
		System.out.println("-----------------------------------------");
		
		
		System.out.println("\n\n2. Iterating hashmap using iterator to collection.");
		
		Collection list = map.values();
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("\n3. Iterating map using iterator to entryset");
		Set<Map.Entry<Integer, String>> ent=map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=ent.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> en=(Map.Entry<Integer, String>)itr.next();
			System.out.println("Key = "+en.getKey()+" value = "+en.getValue());
		}
	}
}