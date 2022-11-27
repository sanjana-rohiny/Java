package com.asiet.ifcae;

public interface Shape {
	int YES = 1;
	int NO = 0;
	
	void printSides();

	default void testDefault() {
		System.out.println("testDefault()");
	}
}
