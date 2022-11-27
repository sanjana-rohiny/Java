


import java.util.ArrayList;
import java.util.List;



class Hospital {
	private List<Doctor> doctorPanel;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
		doctorPanel = new ArrayList<Doctor>();
	}
	
	// aggregation does dependency injction via setter or constructor
	// dependency relation is injected via function...!
	
	// dependency 
	public void addDoctor(Doctor doctor) {
		doctorPanel.add(doctor);
	}
	
	public void printDoctorList() {		
		for (int i=0; i<doctorPanel.size(); i++) {
			System.out.println("Doctor [" + i + "] = " + doctorPanel.get(i).getName()); 
		}
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
	
}



public class Dependency {

	public static void main(String[] srgs) {
		
		Doctor alice = new Doctor("Alice", 100);
		Doctor bob = new Doctor("Bob", 101);
		Doctor sam = new Doctor("Sam", 102);
		Doctor eric = new Doctor("Eric", 103);
		
		
		Hospital hospital = new Hospital();
		
		// doing dependency injection...!
		hospital.addDoctor(alice);;
		hospital.addDoctor(bob);
		hospital.addDoctor(sam );
		hospital.addDoctor(eric);
		
		hospital.printDoctorList();
		
		
		
	}
}

