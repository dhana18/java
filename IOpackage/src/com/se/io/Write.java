package com.se.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Write {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		FileOutputStream fos=new FileOutputStream("two.txt");
		PrintStream ps=new PrintStream(fos);
		
		System.setOut(ps);
		System.out.println("to se");
		
		
	}

}
