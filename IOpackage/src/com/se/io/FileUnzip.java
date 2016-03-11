package com.se.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;

public class FileUnzip {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("temp.txt");
		InflaterInputStream iis=new InflaterInputStream(fis);
		FileOutputStream fos=new FileOutputStream("ouput.txt");
		int ch;
		while((ch=iis.read())!=-1){
			
			
			fos.write(ch);
			
			
		}
	iis.close();
	fos.close();
		
	}

}
