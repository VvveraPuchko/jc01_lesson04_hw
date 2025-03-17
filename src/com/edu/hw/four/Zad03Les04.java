package com.edu.hw.four;

public class Zad03Les04 {

	public static void main(String[] args) {
		double x1 = 7.0;
		double x2 = 2.5;
		double y1 = 1.1;
		double y2 = 3.5;
		double x3 = 6.1;
		double y3 = 4.5;
		double cat1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double cat2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double cat3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double hyp;
		
		if (cat1 > cat2) {
			hyp = cat1;
		} else {
			hyp = cat2;
		}
		
		if (cat3 > hyp) {
			hyp = cat3;
		}
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(hyp);


	}

}
