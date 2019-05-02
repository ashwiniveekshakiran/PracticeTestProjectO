package com.abstractionDemo;

public class MainClass {

	public static void main(String[] args) {
		Car nano = new Car() //Anonymous class
		{ 
			@Override
			String getWeight() {
				// TODO Auto-generated method stub
				return "1211kgs";
			}

			@Override
			String getModelName() {
				// TODO Auto-generated method stub
				return "Nano";
			}
		};
		Aventedor aventedor = new Aventedor();
		Swift swift = new Swift();
		Xylo xylo = new Xylo();
		System.out.println(aventedor);
		System.out.println(swift);
		System.out.println(xylo);
		System.out.println(nano);
		

	}

}
