package com.se.coll;


import java.util.*;

public class EmpList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>(5);
		al.add(0, 100);
		al.add(1, 200);
		al.add(2,300);
		al.add(3,400);
		al.add(4,500);
		al.add(5,600);
		al.add(6,700);
		al.add(7,800);
		al.add(8,900);
		al.add(9,10000);
	
		//Collections.reverse(al);
		
		Collections.shuffle(al);
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
		//for(int i=0;i<al.size();i++){
		//System.out.println(al.get(i));
	//	}
		
		
		/**Iterator i=al.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
			
			
		}
		ListIterator li=al.listIterator();
	li.next();
	li.next();
	li.next();
	li.next();
	
			System.out.println(li.previousIndex());
			
		
		
		for (int li : al) {
			
			System.out.println(li);
			
			
		}
		
		**/
		
	}

}
