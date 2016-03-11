package com.se.jndi;

import org.apache.log4j.Logger;

import javax.naming.*;
import javax.sql.DataSource;

import weblogic.jdbc.common.internal.RemoteDataSource;

import java.sql.Connection;
import java.util.*;

public class Store {
	
	
	static Logger log=Logger.getRootLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable();
		h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
		h.put(Context.PROVIDER_URL,"t3://localhost:7001/");
		h.put(Context.SECURITY_PRINCIPAL,"admin123");
		h.put(Context.SECURITY_CREDENTIALS,"admin123");
		try{
		Context c=new InitialContext(h);
		
		Object o=c.lookup("dbpool");
		System.out.println(o.getClass().getName());
		DataSource ds=(DataSource)o;
		ds.getConnection();
		System.out.println("got conn");
		//RemoteDataSource rds=(RemoteDataSource)o;
		//rds.getConnection();
		//rds.getConnection("admin","admin123");
		
		
		}catch(Exception e){
			
			log.error("invalid user");
			log.info("in catch block");
			//log.info("about",e.getCause());
			log.warn("invalid", e);
			
			
		}
		
		
	}

}
