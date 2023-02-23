package collectionassignment;

import java.util.ArrayList;

public class Q6IterForeach {

	public static void main(String[] args) {
		ArrayList al2 = new ArrayList();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add("Fruit");
		al2.add("Animal");
		al2.add("Flower");
		
		for(Object o:al2)
		{
			System.out.println(o);
		}

	}

}
