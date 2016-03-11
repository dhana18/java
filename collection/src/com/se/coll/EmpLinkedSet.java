package com.se.coll;

import java.util.*;


public class EmpLinkedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lsh=new LinkedHashSet<String>();
		lsh.add("paddu");
		lsh.add("dhana");
		lsh.add("lakshmi");
		lsh.add("10");
		
		lsh.add("dhana");
		System.out.println(lsh);
		
		Iterator i=lsh.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
			
		}
		
		
		
	}

}
