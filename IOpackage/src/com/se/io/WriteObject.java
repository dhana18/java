package com.se.io;

import java.io.*;

public class WriteObject implements Serializable {

	
	String name;
	String pwd;
	WriteObject(String name,String pwd){
		
		this.name=name;
		this.pwd=pwd;
		
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	
		
		
		FileOutputStream fos=new FileOutputStream("three.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		WriteObject w=new WriteObject("dhana","abc"); 
		oos.writeObject(w);

	}

}
