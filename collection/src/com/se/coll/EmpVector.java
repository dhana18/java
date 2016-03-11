package com.se.coll;

import java.util.*;

public class EmpVector {

	public static void main(String[] args) {
	
		int x=10;
		String name="dhana";
		
		
		Vector v=new Vector();
		
		v.add(x);
		v.add(name);
		
		
		System.out.print(v);
		//Iterator i=v.iterator();
		//System.out.print(i.next());
		//System.out.print(i.next());
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
		System.out.println(e.nextElement());
		
		}
		

	}

}
