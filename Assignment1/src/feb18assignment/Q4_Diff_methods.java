package feb18assignment;

import java.util.TreeMap;

public class Q4_Diff_methods {

	public static void main(String[] args) {
		TreeMap<Integer,String> tree=new TreeMap<Integer,String>();
		tree.put(1, "Kunal");
		tree.put(2, "Sidharth");
		tree.put(3, "Sagar");
		tree.put(4, "Samarth");
		
		System.out.println(tree);
		Integer i=tree.ceilingKey(4);
		System.out.println(i);
		
		System.out.println(tree.firstKey());
		System.out.println(tree.firstEntry());
		System.out.println(tree.floorEntry(4));
		System.out.println(tree.higherKey(3));

	}

}
