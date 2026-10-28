package edu.monmouth.problemset3;

import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.Color;

public class ProblemSet3 {

    public static void main(String[] args) {

        CampusVehicle vehicle1 = new CampusVehicle();

        System.out.println("Vehicle 1:");
        System.out.println("ID: " + vehicle1.getId());
        System.out.println("Location: " + vehicle1.getLocation());
        System.out.println("Available: " + vehicle1.isAvailable());
        System.out.println("Color: " + vehicle1.getColor());
        
        vehicle1.setId("mu1850282");
        vehicle1.setLocation("Library");
        vehicle1.setAvailable(true);
        vehicle1.setColor(Color.blue);
        
        System.out.println("Vehicle 1:");
        System.out.println("ID: " + vehicle1.getId());
        System.out.println("Location: " + vehicle1.getLocation());
        System.out.println("Available: " + vehicle1.isAvailable());
        System.out.println("Color: " + vehicle1.getColor());
        
        CampusVehicle vehicle2 = new CampusVehicle("MU654321", "Parking Lot",
                true, Color.orange);
        
        System.out.println("Vehicle 2:");
        System.out.println("ID: " + vehicle2.getId());
        System.out.println("Location: " + vehicle2.getLocation());
        System.out.println("Available: " + vehicle2.isAvailable());
        System.out.println("Color: " + vehicle2.getColor());
        
        vehicle2.setColor(Color.black);
        
        System.out.println("Vehicle 2:");
        System.out.println("ID: " + vehicle2.getId());
        System.out.println("Location: " + vehicle2.getLocation());
        System.out.println("Available: " + vehicle2.isAvailable());
        System.out.println("Color: " + vehicle2.getColor());
        
        CampusVehicle vehicle3 = new CampusVehicle("MU1937402", "University Bluffs",
                false, Color.purple);
        
        CampusVehicle vehicle4 = new CampusVehicle("MU0573908", "spruce hall",
                true, Color.red);
        
        System.out.println("Vehicle 3:");
        System.out.println("ID: " + vehicle3.getId());
        System.out.println("Location: " + vehicle3.getLocation());
        System.out.println("Available: " + vehicle3.isAvailable());
        System.out.println("Color: " + vehicle3.getColor());
        
        System.out.println("Vehicle 4:");
        System.out.println("ID: " + vehicle4.getId());
        System.out.println("Location: " + vehicle4.getLocation());
        System.out.println("Available: " + vehicle4.isAvailable());
        System.out.println("Color: " + vehicle4.getColor());
        
}
    }
