package com.napier.sem;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

public class TestPrintCities {

        static App app;

        @BeforeAll
        static void init()
        {
            app = new App();
        }

        @Test
        void printCitiesTestNull()
        {
            app.printCities(null);
        }

        @Test
        void printCitiesTestEmpty()
        {
            ArrayList<Cities> cities = new ArrayList<Cities>();
            app.printCities(cities);
        }

        @Test
        void printCountriesTestContainsNull()
        {
            ArrayList<Cities> cities = new ArrayList<Cities>();
            cities.add(null);
            app.printCities(cities);
        }

        @Test
        void printCountry()
        {
            ArrayList<Cities> cities = new ArrayList<Cities>();
            Cities city1 = new Cities();
            city1.population = 701927;
            city1.countryCode = "ESP";
            city1.district = "Andalucia";
            city1.id = 656;
            city1.name = "Sevilla";

            cities.add(city1);
            app.printCities(cities);
        }
    }

