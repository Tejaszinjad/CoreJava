56package com.demo;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multi");
		System.out.println("4 for division");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: add(a,b);
		break;
		case 2: sub(a,b);
		break;
		case 3: multi(a,b);
		break;
		case 4: divi(a,b);
		break;
		default:System.out.println("invalid choice");
		}
	}
		public static void add(int a, int b)
		{ 
			System.out.print(a+b);
		}
		public static void sub(int a, int b)
		{ 
			System.out.print(a-b);
		}
		public static void multi(int a, int b)
		{ 
			System.out.print(a*b);
		}
		public static void divi(float a, float b)
		{ 
			System.out.print(a/b);
		}
	}
	
