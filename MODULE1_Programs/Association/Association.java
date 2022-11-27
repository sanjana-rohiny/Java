//package com.java.association;

class Hospital {
	private CEO ceo;
	
	public void addCEO(CEO ceo) {
		this.ceo = ceo;
	}
	
	public void printCEO() {		
		System.out.println("Hospital CEO = " + ceo.getName()); 
	}
}

class CEO {
	private String name;
	private int Id;

	CEO(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Id = 1;
	}

	public String getName() {
		return name;
	}
}

public class Association {

	public static void main(String[] srgs) {		
		
		System.out.println("---------One directional Association-----------");
		CEO ceo = new CEO("John Abraham");

		Hospital hospital = new Hospital();
		hospital.addCEO(ceo);

		hospital.printCEO();
	}
}
