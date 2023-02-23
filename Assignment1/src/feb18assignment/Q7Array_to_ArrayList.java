package feb18assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7Array_to_ArrayList {

	public static void main(String[] args) {

		Integer arr[]= {10, 20, 30, 40};
		
		//Converting Array To ArrayList.
		System.out.println("Converting Array to ArrayList");
		List<Integer> li=Arrays.asList(arr);
		
		ArrayList al=new ArrayList(li);
		System.out.println(al);
		al.add(50);
		System.out.println(al);
		
		//Converting ArrayList to Array.
		System.out.println("Converting ArrayList to Array ");
		Object ar[]=al.toArray();
		for(int i=0;i<ar.length;i++)
		{
		    System.out.println(ar[i]);	
		}
		
		
	}

}
