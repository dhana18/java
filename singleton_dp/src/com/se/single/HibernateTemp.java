package com.se.single;

import org.hibernate.*;


public class HibernateTemp {
	
	public Object load(Object o,int a){
		//Emp e= new Emp();
		Session s=HibernateSingleton.getSession();
		s.load(o, a);
		return o;
		
	}
	
	
	

}
