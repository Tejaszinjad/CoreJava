package edu.jsp.practice;
import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter an integer to check if it's odd or even");
		 int i = sc.nextInt();
		if (i%2==0) {
		System.out.println(i+"number is even");
		}
		else {
			System.out.println(i+"number is odd");
			}
		}
	}

