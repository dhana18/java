package com.se.test;


import org.hibernate.*;
import org.hibernate.cfg.*;



public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Emp e=new Emp();
		e.setEno(1);
e.setName("dhana");
		e.setSalary(1000.3);
		
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	
	
	
	}

}
