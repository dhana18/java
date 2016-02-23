package com.se.single;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Display extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		Emp e=new Emp();
		HibernateTemp hb=new HibernateTemp();
		Object o=hb.load(e, 1);
		System.out.println(o.getClass());
		
		Emp e1=(Emp)o;
		System.out.println(e1.eno);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		
		
		
		
		
	}
	
	
	
	
}
