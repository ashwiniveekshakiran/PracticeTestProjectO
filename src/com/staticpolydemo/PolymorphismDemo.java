package com.staticpolydemo;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo obj = new PolymorphismDemo();

		System.out.println(obj.add(1, 1.2));
		System.out.println(obj.add(1, 4));
		System.out.println(obj.add(1, 1, 1));
	}

	public int add(int a, int b) {
		return a + b;
	}

	public double add(int a, double b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
