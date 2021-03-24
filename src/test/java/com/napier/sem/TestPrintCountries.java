package com.napier.sem;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

public class TestPrintCountries {
    static App app;


    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printCountriesTestNull()
    {
        app.printCountries(null);
    }

    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        app.printCountries(countries);
    }

    @Test
    void printCountriesTestContainsNull()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(null);
        app.printCountries(countries);
    }

    @Test
    void printCountry()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country cntry = new Country();
        cntry.code = "BGR";
        cntry.name = "Bulgaria";
        cntry.continent = "Europe";
        cntry.region = "Bulgaria";
        cntry.surfaceArea = 12;
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


}
