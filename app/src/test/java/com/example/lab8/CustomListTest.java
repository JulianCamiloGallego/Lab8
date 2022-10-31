package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * we create a CustomList object before running
     */
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one, something
     */
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * this adds a city to the list
     * checks if the list has the city
     */
    @Test
    public void hasCityTest(){
        City newCity = new City("Hong Kong", "HK");
        list.addCity(newCity);
        assertTrue(list.hasCity(newCity));
    }
    /**
     * this adds a city to the list
     * deletes the city from the list
     * check if the city is removed
     */
    @Test
    public void deleteCityTest(){
        City newCity = new City("Macau", "MO");
        list.addCity(newCity);
        list.deleteCity(newCity);
        assertFalse(list.hasCity(newCity));
    }
    /**
     * this adds 3 cities to the list
     * checks if there are 3 cities in the list
     */
    @Test
    public void countCitiesTest(){
        City newCity1 = new City("Vancouver", "BC");
        City newCity2 = new City("Edmonton", "AB");
        City newCity3 = new City("Calgary", "AB");

        list.addCity(newCity1);
        list.addCity(newCity2);
        list.addCity(newCity3);

        int count = list.countCities();

        assertEquals(3, count);

    }
}
