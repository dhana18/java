package com.se.hib;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class SroreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Emp e=new Emp();
		
		
		
		s.load(e,101);
		System.out.println(e.eno);
		System.out.println(e.name);
		System.out.println(e.salary);
		
		s.close();
		sf.close();
		
		
		
		
	}

}
