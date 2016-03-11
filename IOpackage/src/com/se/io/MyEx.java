package com.se.io;

import java.io.*;

public class MyEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("ouput.txt");
		FileOutputStream fos=new FileOutputStream("welcome.txt");
		int ch;
		while((ch=fis.read())!=-1){
			
			System.out.println((char)ch);
			
		}
		
	}

}
