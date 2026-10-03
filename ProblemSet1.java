package edu.monmouth.problemset1;

public class ProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CampusVehicle vehicle1 = new CampusVehicle(" jeep", " commuter lot ", true );
		CampusVehicle vehicle2 = new CampusVehicle(" van", " library ", false );
		CampusVehicle vehicle3 = new CampusVehicle(" tesla", " residential lot ", true );
		
		System.out.println(vehicle1.getId() + vehicle1.getLocation() + vehicle1.isAvailable());
		System.out.println(vehicle2.getId() + vehicle2.getLocation() + vehicle2.isAvailable());
		System.out.println(vehicle3.getId() + vehicle3.getLocation() + vehicle3.isAvailable());
		
		vehicle1.setId("bmw");
		vehicle2.setLocation(" dining hall ");
		vehicle3.setAvailable(false);
		
		System.out.println(vehicle1.getId() + vehicle1.getLocation() + vehicle1.isAvailable());
		System.out.println(vehicle2.getId() + vehicle2.getLocation() + vehicle2.isAvailable());
		System.out.println(vehicle3.getId() + vehicle3.getLocation() + vehicle3.isAvailable());
		

	}

}
