package collectionassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q14SearchElement {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(15);
		al.add(20);
		al.add(36);
		al.add(45);
		
		System.out.println(al);
		
		System.out.println("Enter element to be search");
		Integer i1 = sc.nextInt();
		
		int flag = 0;
		
		for(int i = 0; i < al.size(); i++)
		{
			
			if(al.get(i) == i1)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("Element is not present");
		}
		else
		{
			System.out.println("Element is present");
		}
	}

}
