package com.abstractionDemo;

public abstract class Car {

	int getNoOfWheels() {
		return 4;
	}
	
	String getModelName() {
		return this.getClass().getSimpleName();
	}

	abstract String getWeight();

	int getNoOfDoors() {
		return 4;
	}

	int getCapacity() {
		return 5;
	}

	@Override
	public String toString() {
		return "Car [getNoOfWheels()=" + getNoOfWheels() + ", getModelName()=" + getModelName() + ", getWeight()="
				+ getWeight() + ", getNoOfDoors()=" + getNoOfDoors() + ", getCapacity()=" + getCapacity() + "]";
	}


	
}
