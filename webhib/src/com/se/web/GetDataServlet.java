package com.se.web;

import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;


public class GetDataServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		String hquery="from com.se.web.Product";
		Query squery=s.createQuery(hquery);
		List l=squery.list();
		ArrayList al=(ArrayList)l;
		Iterator i=al.iterator();
		
		
		PrintWriter out=res.getWriter();
		
		while(i.hasNext()){
			
			Product p=(Product)i.next();
			out.println(p.pid);
			out.println(p.name);
			out.println(p.price);
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}




