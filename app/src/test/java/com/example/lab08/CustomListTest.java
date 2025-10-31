package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList makeList() {
        return new CustomList();
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary)); // this must fail with the stub
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City saskatoon = new City("Saskatoon", "SK");
        list.addCity(saskatoon);
        assertTrue(list.hasCity(saskatoon));

        list.deleteCity(saskatoon);

        assertFalse(list.hasCity(saskatoon));
    }

}