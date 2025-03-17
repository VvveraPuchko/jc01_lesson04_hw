package com.edu.hw.four;

public class Zad06Les04 {

	public static void main(String[] args) {
		int a = 7895;
		double sum = 0;
		double b;
		
		while(a>0) {
			b = a % 10;
			sum = sum + b;
			a = a /10;
			System.out.println(b);
			
		}
		System.out.println(sum);

	}

}
