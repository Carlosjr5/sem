package com.napier.sem;


// This class is used to extract information out from countrylanguage in the world.sql database


public class CountryLanguage {


    // Country code.
    public String countryCode;

    // Country Language.
    public String language;

    //Country Official Language.
    public boolean isOfficial;

    // Country percentage.
    public float percentage;



    // Country Language constructor init
    public CountryLanguage() {}
    public CountryLanguage(String countryCode, String language, boolean isOfficial, float percentage)
    {
        this.countryCode=countryCode;
        this.language=language;
        this.isOfficial=isOfficial;
        this.percentage=percentage;
    }


    //override
    @Override
    public String toString()
    {
        return "City{" + "countryCode=" + countryCode + ", language='" + language + '\'' + ", isOfficial='" + isOfficial + '\'' +
                ", percentage='" + percentage + '}';
    }


    // Following statements used for generating getters and setters for the country languages variables.

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }


    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String district)
    {
        this.language = language;
    }


    public boolean getisOfficial()
    {
        return isOfficial;
    }

    public void setOfficial(boolean isOfficial) { this.isOfficial = isOfficial; }

    public float getPercentage()
    {
        return percentage;
    }

    public void setPercentage(float percentage) { this.percentage = percentage; }


}

