
package edu.monmouth.problemset4;

import java.util.Arrays;
import edu.monmouth.campusvehicle.*;

public class ProblemSet4 {

    public static void main(String[] args) {

        CampusVehicle[] campusVehicles =
            new CampusVehicle[CampusVehicleConstants.NUMBER_OF_VEHICLES];


        CampusVehicle campusVehicle1 = new CampusVehicle(
            "mu1001ub", "University Bluffs", true, Color.black);

        CampusVehicle campusVehicle2 = new CampusVehicle(
            "mu1001lib", "Library", true, Color.green);

        CampusVehicle campusVehicle3 = new CampusVehicle(
            "mu1001pl", "Parking Lot", true, Color.blue);

        CampusVehicle campusVehicle4 = new CampusVehicle(
            "mu1001lh", "Laurel Hall", true, Color.white);

        CampusVehicle campusVehicle5 = new CampusVehicle(
            "mu1001sh", "Spruce Hall", true, Color.black);

        CampusVehicle campusVehicle6 = new CampusVehicle(
            "mu1002lib", "Library", true, Color.yellow);

        CampusVehicle campusVehicle7 = new CampusVehicle(
            "mu1002pl", "Parking Lot", true, Color.black);

        CampusVehicle campusVehicle8 = new CampusVehicle(
            "mu1002sh", "Spruce Hall", true, Color.blue);

        CampusVehicle campusVehicle9 = new CampusVehicle(
            "mu101", "University Bluffs", true, Color.black);

        CampusVehicle campusVehicle10 = new CampusVehicle(
            "mu1003pl", "Campus Police", true, Color.black);

        campusVehicles[0] = campusVehicle1;
        campusVehicles[1] = campusVehicle2;
        campusVehicles[2] = campusVehicle3;
        campusVehicles[3] = campusVehicle4;
        campusVehicles[4] = campusVehicle5;
        campusVehicles[5] = campusVehicle6;
        campusVehicles[6] = campusVehicle7;
        campusVehicles[7] = campusVehicle8;
        campusVehicles[8] = campusVehicle9;
        campusVehicles[9] = campusVehicle10;


        System.out.println("ALL CAMPUS VEHICLES");

        for (CampusVehicle vehicle : campusVehicles) {
            printVehicle(vehicle);
        }


        System.out.println("\nVEHICLES AT LIBRARY");

        for (CampusVehicle vehicle : campusVehicles) {

            if (vehicle.getLocation().equalsIgnoreCase("Library")) {
                printVehicle(vehicle);
            }
        }


        System.out.println("\nAVAILABLE VEHICLES");

        for (CampusVehicle vehicle : campusVehicles) {

            if (vehicle.isAvailable()) {
                printVehicle(vehicle);
            }
        }


        campusVehicles[0].setAvailable(false);
        campusVehicles[1].setAvailable(false);
        campusVehicles[2].setAvailable(false);
        campusVehicles[3].setAvailable(false);


        System.out.println("\nAVAILABLE VEHICLES AFTER CHECKOUT");

        for (CampusVehicle vehicle : campusVehicles) {

            if (vehicle.isAvailable()) {
                printVehicle(vehicle);
            }
        }


        int count = 0;

        for (CampusVehicle vehicle : campusVehicles) {

            if (vehicle.getLocation().equalsIgnoreCase("University Bluffs")) {
                count++;
            }
        }

        System.out.println("\nVehicles at University Bluffs: " + count);


        CampusVehicle[] universityBluffsVehicles =
            new CampusVehicle[count];


        int index = 0;

        for (CampusVehicle vehicle : campusVehicles) {

            if (vehicle.getLocation().equalsIgnoreCase("University Bluffs")) {

                universityBluffsVehicles[index] = vehicle;
                index++;
            }
        }


        System.out.println("\nNumber of University Bluffs vehicles: "
            + universityBluffsVehicles.length);


        System.out.println("\nUNIVERSITY BLUFFS VEHICLES");

        for (CampusVehicle vehicle : universityBluffsVehicles) {
            printVehicle(vehicle);
        }


        CampusVehicle[] initArray =
            new CampusVehicle[CampusVehicleConstants.INITIAL_ARRAY_SIZE];

        CampusVehicle initializeVehicle = new CampusVehicle();

        Arrays.fill(initArray, initializeVehicle);


        System.out.println("\nINITIALIZED VEHICLES");

        for (CampusVehicle vehicle : initArray) {
            printVehicle(vehicle);
        }

    }


    public static void printVehicle(CampusVehicle vehicle) {

        System.out.println(
            "ID: " + vehicle.getId()
            + " | Location: " + vehicle.getLocation()
            + " | Color: " + vehicle.getColor()
            + " | Available: " + vehicle.isAvailable()
        );
    }

}
