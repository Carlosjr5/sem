package com.napier.sem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {
    static App app;


    @BeforeAll
    static void init() {
        app = new App();
        app.connect("localhost:33060");
    }

    @Test
    void testGetCountriesByN() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries = app.getCountryListByWorld();
        assertEquals(countries.get(0).name, "China");
    }

    @Test
    void getCountryListByContinent() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries = app.getCountryListByContinent("Asia");
        assertEquals(countries.get(0).name, "China");
    }

    @Test
    void getCityListByContinent() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCityListByContinent("Africa");
        assertEquals(cities.get(0).name, "Cairo");
    }

    @Test
    void capitalCitiesInRegionN() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCapitalListInRegion("Caribbean");
        assertEquals(cities.get(0).name, "La Habana");
    }

    @Test
    void printNCapitalCitiesInContinent() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCapitalListInContinent("Europe");
        assertEquals(cities.get(0).name, "Moscow");
    }

    @Test
    void getNCapitalCitiesInWorld() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCapitalListInWorld();
        assertEquals(cities.get(0).name, "Seoul");
    }

    @Test
    void getNCitiesByDistrict() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCityListByDistrict("Burgas");
        assertEquals(cities.get(1).name, "Sliven");
    }

    @Test
    void getCountryListByRegion() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries = app.getCountryListByRegion("Caribbean");
        assertEquals(countries.get(0).name, "Cuba");
    }

    @Test
    void getCityListByWorld() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCityListByWorld();
        assertEquals(cities.get(1).name, "Seoul");
    }

    @Test
    void getCityListByRegion() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCityListByRegion("Caribbean");
        assertEquals(cities.get(1).name, "Santo Domingo de Guzmán");
    }

    @Test
    void getCityListByCountry() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities = app.getCityListByCountry("Bulgaria");
        assertEquals(cities.get(1).name, "Plovdiv");
    }
}