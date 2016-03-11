package com.se.coll;


import java.util.*;

public class EmpLinkedlist {
	
	
	String uname="dhana";
	String pwd="welcome";
	
	
	public static void main(String ar[]){
		
		
		EmpLinkedlist elist=new EmpLinkedlist();
		
		LinkedList al=new LinkedList();
		al.add(elist);
		
		Iterator i=al.iterator();
		while(i.hasNext()){
			

			EmpLinkedlist emp=(EmpLinkedlist)i.next();
			
			System.out.println(emp.uname);
			System.out.println(emp.pwd);
			
			
			
			
			
		}
		
	}
	

}
