package com.asiet.ifcae;

public class TestIface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Shape shape = rect;
		shape.printSides();
		shape = new Triangle();
		shape.printSides();
		
		Description d = rect;
		d.printInfo();
		
		rect.printSides();
	}
}
