package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    @Test
    void addVehicle_changesInventory() {

        Dealership d = new Dealership("Paul", "222 Old Road", "607-272-4311");
        Vehicle v = new Vehicle(12345, 1992, "Honda", "Civic", "sedan", "black", 25090, 1500.);

        assertEquals(0, d.getInventory().size());
        d.addVehicle(v);
        assertEquals(1, d.getInventory().size());
    }
}