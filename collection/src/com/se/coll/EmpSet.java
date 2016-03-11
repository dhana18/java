package com.se.coll;


import java.util.*;

public class EmpSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(10);
		hs.add(30);
		hs.add(20);
		//hs.clear();
		System.out.print(hs.isEmpty());
		System.out.println(hs.contains(10));
		System.out.println(hs.size());
		Iterator i=hs.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
			
			
		}
		
		
		
		
		

	}

}
