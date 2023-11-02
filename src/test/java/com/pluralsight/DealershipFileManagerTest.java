package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {

    @Test
    void getDealership_getDealership_doesntThrowException() {
        DealershipFileManager dfm = new DealershipFileManager();
        dfm.getDealership();
    }

    @Test
    void getDealership_getDealership_dealershipInfoReadCorrectly() {
        DealershipFileManager dfm = new DealershipFileManager();
        Dealership d = dfm.getDealership();
        assertEquals("D & B Used Cars", d.getName());
        assertEquals("111 Old Benbrook Rd", d.getAddress());
        assertEquals("817-555-5555", d.getPhone());
    }

}