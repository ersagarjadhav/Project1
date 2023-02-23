package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Q18DisplayEven {

	public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 50; i++)
		{
			al.add(i+1);
		}
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			Integer in = it.next();
			if(in % 2 == 0)
			{
				System.out.println(in);
			}
		}

	}

}