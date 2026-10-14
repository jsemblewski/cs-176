package edu.monmouth.problemset2;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CampusVehicle vehicle1 = new CampusVehicle();
		
		System.out.println("Vehicle 1:");
        System.out.println("ID: " + vehicle1.getId());
        System.out.println("Location: " + vehicle1.getLocation());
        System.out.println("Available: " + vehicle1.isAvailable());
        
        vehicle1.setId("MU1234");
        vehicle1.setLocation("Library");
        vehicle1.setAvailable(true);
        
        System.out.println("Vehicle 1:");
        System.out.println("ID: " + vehicle1.getId());
        System.out.println("Location: " + vehicle1.getLocation());
        System.out.println("Available: " + vehicle1.isAvailable());
        
        vehicle1.checkOut();
        System.out.println(vehicle1.isAvailable());

        vehicle1.returnVehicle();
        System.out.println(vehicle1.isAvailable());
        
        CampusVehicle vehicle2 = new CampusVehicle("MU5678", "Spruce Hall", false);
        
        System.out.println("Vehicle 2:");
        System.out.println("ID: " + vehicle2.getId());
        System.out.println("Location: " + vehicle2.getLocation());
        System.out.println("Available: " + vehicle2.isAvailable());
        
        vehicle2.setId("MU1090");
        vehicle2.setLocation("library");
        vehicle2.setAvailable(true);
        
        System.out.println("ID: " + vehicle2.getId());
        System.out.println("Location: " + vehicle2.getLocation());
        System.out.println("Available: " + vehicle2.isAvailable());
        
        vehicle2.checkOut();
        System.out.println(vehicle2.isAvailable());

        vehicle2.returnVehicle();
        System.out.println(vehicle2.isAvailable());
        //l

        CampusVehicle vehicle3 = new CampusVehicle("ABC", "Gym", true);
        System.out.println("\nVehicle 3:");
        System.out.println("ID: " + vehicle3.getId());
        System.out.println("Location: " + vehicle3.getLocation());
        System.out.println("Available: " + vehicle3.isAvailable());

        vehicle3.checkOut();
        System.out.println(vehicle3.isAvailable());
        vehicle3.returnVehicle();
        System.out.println(vehicle3.isAvailable());


        CampusVehicle vehicle4 = new CampusVehicle("MU1234567890123", "", false);
        System.out.println("\nVehicle 4:");
        System.out.println("ID: " + vehicle4.getId());
        System.out.println("Location: " + vehicle4.getLocation());
        System.out.println("Available: " + vehicle4.isAvailable());

        vehicle4.checkOut();
        System.out.println(vehicle4.isAvailable());
        vehicle4.returnVehicle();
        System.out.println(vehicle4.isAvailable());


        CampusVehicle vehicle5 = new CampusVehicle(null, null, true);
        System.out.println("\nVehicle 5:");
        System.out.println("ID: " + vehicle5.getId());
        System.out.println("Location: " + vehicle5.getLocation());
        System.out.println("Available: " + vehicle5.isAvailable());

        vehicle5.checkOut();
        System.out.println(vehicle5.isAvailable());
        vehicle5.returnVehicle();
        System.out.println(vehicle5.isAvailable());
        
	}

}
