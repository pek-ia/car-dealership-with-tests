package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    Dealership d = new Dealership("Paul", "222 Old Road", "607-272-4311");

    @Test
    public void dealership_Inventory_IsEmptyAfterConstructor(){
        // Arrange
        // Act
        // Assert
        assertEquals(0, d.getInventory().size());
    }

    @Test
    void addVehicle_changesInventory() {

        // Arrange
        Vehicle v = new Vehicle(12345, 1992, "Honda", "Civic", "sedan", "black", 25090, 1500.);
        int one_more_than_empty = 1;

        // Act
        d.addVehicle(v);

        // Assert
        assertEquals(one_more_than_empty, d.getInventory().size());
    }
}