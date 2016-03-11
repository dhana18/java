package com.se.coll;


import java.util.*;

public class EmpLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("one", 1);
		lm.put(2,300);
		lm.put(null, 100);
		lm.put(null, 3877);
		
		
		TreeMap tm=new TreeMap();
		
		tm.put("a", "200");
		tm.put("b", "300");
		tm.put("3", "33434");
		//tm.put(null, 1000);
		
		System.out.println(tm);

		Collection e=tm.values();
		System.out.println(e);
		
	}

}
