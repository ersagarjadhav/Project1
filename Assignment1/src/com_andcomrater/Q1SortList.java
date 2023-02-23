package com_andcomrater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q1SortList {

	public static void main(String[] args) {

		ArrayList<String>al=new ArrayList<String>();
		al.add("Nashik");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Kolhapur");
		al.add("Sangli");
		
		Collections.sort(al);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
