package com.se.single;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import org.hibernate.*;
import java.util.*;



public class DisplayServlet extends HttpServlet{
	
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	
	Session s=HibernateSingleton.getSession();
	String hquery="from com.se.single.Emp";
	Query squery=s.createQuery(hquery);
	List l=squery.list();
	ArrayList al=(ArrayList)l;
	Iterator i=al.iterator();
	PrintWriter out=res.getWriter();
	System.out.println("servlet");
	while(i.hasNext()){
		
	Emp e=	(Emp)i.next();
	out.println(e.eno);
		out.println(e.name);
		out.print(e.salary);
		System.out.println("singl");
	}
	System.out.println("single");
	
}	
	
	
}


