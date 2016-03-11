package com.se.coll;

import java.util.*;


public class EmpHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap hm=new HashMap();
		hm.put(1, 100);
		hm.put(1, 500);
		hm.put(2, 300);
		hm.put(4, 400);
		
		
//System.out.println(hm);
	
	Collection c=hm.values();
	Iterator i=c.iterator();
	while(i.hasNext()){
	System.out.println(i.next());
	}
	
	Calendar cal=Calendar.getInstance();
	System.out.println(cal);
	System.out.println(cal.getTime());
	
	Hashtable h=new Hashtable();
	h.put(1, 10);
	h.put(3, 20);
	h.put(2, 67);
//	h.put(null, 100);
	System.out.println(h);
	
	
	
	}

}
