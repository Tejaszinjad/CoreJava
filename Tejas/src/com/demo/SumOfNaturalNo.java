package com.demo;

public class SumOfNaturalNo {

	public static void sumOfNatural( ) {
		int n =20; int sum = 0;
		for(int i=1; i<=n;i++)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
}
	
	public static void main(String[]args) {
		sumOfNatural();
		sumOfNatural();
	}
}
