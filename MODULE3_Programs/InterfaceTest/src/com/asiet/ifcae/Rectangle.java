package com.asiet.ifcae;

public class Rectangle implements Shape, Description {
	@Override
	public void printSides() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle:: No of Sides = 4");

	}

	public void printInfo() {
	// TODO Auto-generated method stub
	System.out.println("Rectangle:: printInfo()");
	}
	
	public void localFunction() {
		System.out.println("I am inside Rectangle::localFuction()");
	}
}
