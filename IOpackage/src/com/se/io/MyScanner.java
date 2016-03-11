package com.se.io;



import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter uname");
		String name=s.nextLine();
		
		System.out.println("enter pwd");
		String pwd=s.nextLine();
		
		
System.out.println(name+"welcome"+pwd);
	}

}
