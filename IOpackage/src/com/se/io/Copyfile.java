package com.se.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.*;

public class Copyfile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("ouput.txt");
		Scanner s=new Scanner(fis);
		
		File f=new File("welcome.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("sadfsdr");
		while(s.hasNext()){
		System.out.println(s.nextLine());
		fw.write("ashgdsjfhisufhasf");
		}
		
	}

}
