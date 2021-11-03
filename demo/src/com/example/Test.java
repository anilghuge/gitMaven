package com.example;

import java.util.Scanner;

public class Test {

	static int a;
	static int b;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		int c=a+b;
		System.out.println("C :"+c);
	
	}

}
