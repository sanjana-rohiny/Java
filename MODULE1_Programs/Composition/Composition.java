//package com.java.composition;

import java.util.ArrayList;
import java.util.List;

class Hospital {
	private List<Doctor> doctorPanel;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
		doctorPanel = new ArrayList<Doctor>();
	}
	
	public void setDoctorPanel(String name, int id) {
		
		Doctor doctor = new Doctor(name, id);
		doctorPanel.add(doctor);
	}
	
	public void printDoctorList() {		
		for (int i=0; i<doctorPanel.size(); i++) {
			System.out.println("Doctor [" + i + "] = " + doctorPanel.get(i).getName()); 
		}
	}
	
	protected void finalize() {
		System.out.println("delete Hospital class");
	}
} 

class Doctor {
	private String name;
	private int Id;
	
	Doctor(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Id = id;
	}

	public String getName() {
		return name;
	}
	
	protected void finalize() {
		System.out.println("delete Doctor class");
	}
}

public class Composition {

	public static void main(String[] srgs) {	
		
		Hospital hospital = new Hospital();
		
		hospital.setDoctorPanel("Alice", 100);
		hospital.setDoctorPanel("Bob", 101);
		hospital.setDoctorPanel("Sam", 102);
		hospital.setDoctorPanel("Ericsson", 103);
		
		hospital.printDoctorList();
		
		System.out.println("Deleting Hospital class");
		
		
		// For compiling , use javac -Xlint:deprecation Composition.java
		
		// delete whole class
		// invoke "whole"  class deallocation.
		hospital = null;
		System.gc();
		System.runFinalization();
		// Observe from print statement, 
		// that both hospital and doctor class are deleted
		// 
	}
	
}
