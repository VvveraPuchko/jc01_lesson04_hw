package com.edu.hw.four;

public class Zad04les04 {

	public static void main(String[] args) {
		double angle; 
		double rad;
		double length;
		double sq;
		
		angle = 35;
		rad = 16;
		length = 2 * Math.PI * rad * (angle/360);
		sq = Math.PI * Math.pow(rad, 2) * (angle/360);
		
		System.out.println(length);
		System.out.println(sq);

	}

}
