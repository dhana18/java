package com.se.io;


import java.io.*;
import java.util.zip.DeflaterOutputStream;



public class ReadFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:/Users/user/collections/one.txt");
		
		FileOutputStream fos=new FileOutputStream("temp.txt");
		
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		int ch;
		
		while( (ch=fis.read())!=-1){
			
			
			dos.write(ch);
			
			
		}
		
		fis.close();
		dos.close();
		
		
		
	}

}
