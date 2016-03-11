package com.se.io;

import java.io.FileReader;

public class Fileread {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("ouput.txt");
		
		int ch;
		while((ch=fr.read())!=-1){
			
			System.out.println((char)ch);
			
		}
		
		
		
	}

}
