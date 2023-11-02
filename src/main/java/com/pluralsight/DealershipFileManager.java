package com.pluralsight;

import com.pluralsight.Dealership;

import java.io.*;

public class DealershipFileManager {

    public Dealership getDealership() {
        try (BufferedReader inventoryFileReader = new BufferedReader(new FileReader("inventory.csv"))) {
            String dealershipString = inventoryFileReader.readLine();
            String[] dealershipData = dealershipString.split("\\|");
            String name = dealershipData[0];
            String address = dealershipData[1];
            String phone = dealershipData[2];

            Dealership newDealership = new Dealership(name, address, phone);

            String vehicleString;
            while ((vehicleString = inventoryFileReader.readLine()) != null) {
                String[] vehicleData = vehicleString.split("\\|");

                if (vehicleData.length == 8) {
                    int vin = Integer.parseInt(vehicleData[0]);
                    int year = Integer.parseInt(vehicleData[1]);
                    String make = vehicleData[2];
                    String model = vehicleData[3];
                    String vehicleType = vehicleData[4];
                    String color = vehicleData[5];
                    int odometer = Integer.parseInt(vehicleData[6]);
                    double price = Double.parseDouble(vehicleData[7]);

                    // Creates a com.pluralsight.Vehicle object and stores it
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    newDealership.addVehicle(vehicle);

                }
            }
            inventoryFileReader.close();
            return newDealership;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Dealership("nothing", "in", "here");
    }

    public void saveDealership(Dealership dealership) {
        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("inventory.csv", true))) {

            String info = String.format("%-20s|%-20s|%-20s|%s",
                    dealership.getName(),
                    dealership.getAddress(),
                    dealership.getPhone(),
                    dealership.getAllVehicles());

                bufWriter.write(info + "\n");
                System.out.println("\nThank you. Your entry has been saved.");

                bufWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
