package feb18assignment;

import java.util.TreeSet;

public class Q13SetTree {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(80);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);

		System.out.println("Original TreeSet Is "+ts);

		System.out.println("lowest element Is Removed : "+ts.pollFirst());
		System.out.println("After Removed TreeSet Is : "+ts);
	}

}
