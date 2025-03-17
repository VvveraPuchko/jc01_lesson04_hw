package com.edu.hw.four;

public class Zad07Les04 {

	public static void main(String[] args) {
		double x;
		double y;
		double ariphm;
		double geom;
		
		x = 4.5;
		y = 3.9;
		ariphm = (Math.pow(x, 2) + Math.pow(y, 2))/2;
		geom = Math.sqrt(Math.abs(x) * Math.abs(y));
		
		System.out.println(ariphm);
		System.out.println(geom);
		
	}

}
