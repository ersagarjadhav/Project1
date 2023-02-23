package com_andcomrater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q2Sort1List {

	public static void main(String[] args) {
      ArrayList<Integer>list=new ArrayList<Integer>();
      list.add(87895);
      list.add(22222);
      list.add(75846);
      list.add(35489);
      list.add(12348);
      
      Collections.sort(list);
      
      Iterator itr=list.iterator();
      
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      
	}

}
