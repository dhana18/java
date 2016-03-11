package com.se.io;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		FileWriter fw=new FileWriter("dhana.txt",true);
		String str="dhana";
		fw.write(str);
		//char[]c=str.toCharArray();
		//fw.write(c);
		/**for(int i=0;i<str.length();i++){
			
			
			fw.write(str.charAt(i));
		}**/
		
		fw.close();
		
		
	}

}
