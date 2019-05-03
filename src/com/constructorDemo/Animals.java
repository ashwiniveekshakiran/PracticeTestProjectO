package com.constructorDemo;

public class Animals {
	String Name;

	Animals() 
	{
		this.Name ="Cow";
	}

	public static void main(String[] args) {

		Animals a = new Animals();
		System.out.println(a.Name);
	}

}
