package com.napier.sem;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

public class UnitTesting {

    static App app;

    /**
     * Test Print Cities
     */
    @BeforeAll
    static void init() {
        app = new App();
    }

    @Test
    void printCitiesNull() {
        app.printCities(null);
    }

    @Test
    void printCitiesEmpty() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        app.printCities(cities);
    }

    @Test
    void printCitiesContainsNull() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.add(null);
        app.printCities(cities);
    }

    @Test
    void printCities() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        Cities city1 = new Cities();
        city1.population = 701927;
        city1.countryCode = "ESP";
        city1.district = "Andalucia";
        city1.id = 656;
        city1.name = "Seville";

        cities.add(city1);
        app.printCities(cities);
    }


    /**
     * Test Print Countries
     */

    @Test
    void printCountriesNull() {
        app.printCountries(null);
    }

    @Test
    void printCountriesEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountries(countries);
    }

    @Test
    void printCountriesContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printCountries(countries);
    }

    @Test
    void printCountry() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country cntry = new Country();
        cntry.code = "BGR";
        cntry.name = "Bulgaria";
        cntry.continent = "Europe";
        cntry.region = "Bulgaria";
        cntry.surfaceArea = 12;
        cntry.indepYear = 681;
        cntry.population = 7800000;
        cntry.lifeExpectancy = 81;
        cntry.gNP = 123;
        cntry.gNPOld = 13;
        cntry.localName = "BG";
        cntry.governmentForm = "Democracy";
        cntry.headOfState = "Boko";
        cntry.capital = "Sofia";
        cntry.code2 = "BG";

        countries.add(cntry);
        app.printCountries(countries);
    }

    /**
     * Test Print Countries By N
     */


    @Test
    void printCountriesByNNull() {
        app.printCountriesByN(null, 1);
        app.printCountriesByN(null, 0);
    }

    @Test
    void printCountriesByNEmpty() {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountriesByN(countries, 10);
    }

    @Test
    void printCountriesByNContainsNull() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printCountriesByN(countries, 10);
    }

    @Test
    void printCountryByN() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country cntry = new Country();
        cntry.code = "BGR";
        cntry.name = "Bulgaria";
        cntry.continent = "Europe";
        cntry.region = "Bulgaria";
        cntry.surfaceArea = 12;
        cntry.indepYear = 681;
        cntry.population = 7800000;
        cntry.lifeExpectancy = 81;
        cntry.gNP = 123;
        cntry.gNPOld = 13;
        cntry.localName = "BG";
        cntry.governmentForm = "Democracy";
        cntry.headOfState = "Boko";
        cntry.capital = "Sofia";
        cntry.code2 = "BG";

        countries.add(cntry);
        app.printCountriesByN(countries, 5);
    }

    /**
     * Test Print C By Cities
     */

    @Test
    void printCitiesByNNull() {
        app.printCitiesByN(null, 1);
        app.printCitiesByN(null, 0);
    }

    @Test
    void printCitiesByNEmpty() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        app.printCitiesByN(cities, 4);
    }

    @Test
    void printCitiesByNContainsNull() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.add(null);
        app.printCitiesByN(cities, 8);
    }

    @Test
    void printCitiesByN() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        Cities city1 = new Cities();
        city1.population = 701927;
        city1.countryCode = "ESP";
        city1.district = "Andalucia";
        city1.id = 656;
        city1.name = "Seville";

        cities.add(city1);
        app.printCitiesByN(cities, 4);
    }

}