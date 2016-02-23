package com.se.single;


import org.hibernate.*;
import org.hibernate.cfg.*;



public class HibernateSingleton {
	
	
	public static SessionFactory sf;
	
	static{
		
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		System.out.println("single obj");
		
	}
	
	
	public static SessionFactory getSessionFactory(){
		
		return sf;
		
	}
	
	public static Session getSession(){
		
		
		return sf.openSession();
	}
	public HibernateSingleton(){
		
		System.out.println("single obj");
		
		
	}
	
	
	

}
