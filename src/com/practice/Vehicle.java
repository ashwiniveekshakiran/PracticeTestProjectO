package com.practice;

public class Vehicle {
	
	Vehicle()
	{
		System.out.println("Car");
	}
	
	String getColor()
	{
		return "Ash";
	}
	
	String getWeight()
	{
		return "189kgs";
	}
	int getNoOfWheels()
	{
		return 4;
	}
	String getName()
	{
		return"Maruthi";
	}

	@Override
	public String toString() {
		return "Vehicle [getColor()=" + getColor() + ", getWeight()=" + getWeight() + ", getNoOfWheels()="
				+ getNoOfWheels() + ", getName()=" + getName() + "]";
	}

}
