package com.napier.sem;


// This class is used to extract information out from countries in the world.sql database


public class Country {

    // Code.
    public String code;

    // Name.
    public String name;

    // Continent.
    public String continent;

    // Region.
    public String region;

    //Surface Area.
    public float surfaceArea;

    //indepYear.
    public Integer indepYear;

    // Population.
    public int population;

    //lifeExpectancy.
    public float lifeExpectancy;

    //gNP.
    public float gNP;

    //gNPOld.
    public float gNPOld;

    //localName.
    public String localName;

    //Government Form.
    public String governmentForm;

    //headOfState.
    public String headOfState;

    //Capital.
    public String capital;

    //Code 2.
    public String code2;




    // Country constructor init
    public Country() {}
    public Country (String code,String name,String continent,String region, float surfaceArea, int indepYear,int population,
                    float lifeExpectancy,float gNP, float gNPOld, String localName, String governmentForm, String headOfState,String capital, String code2)
    {
        this.code=code;
        this.name=name;
        this.continent=continent;
        this.region=region;
        this.surfaceArea=surfaceArea;
        this.indepYear=indepYear;
        this.population=population;
        this.lifeExpectancy=lifeExpectancy;
        this.gNP=gNP;
        this.gNPOld=gNPOld;
        this.localName=localName;
        this.governmentForm=governmentForm;
        this.headOfState=headOfState;
        this.capital=capital;
        this.code2=code2;
    }


    @Override
    public String toString()
    {
        return "Country{" + "code=" + code + ", name='" + name + '\'' + ", continent='" + continent +
                '\'' + ", region='" + region + '\''  + ", surfaceArea=" + surfaceArea +'\'' + ", indepYear=" + indepYear +
                '\'' + ", population=" + population  + '\'' + ", lifeExpectancy=" + lifeExpectancy  +
                '\'' + ", gNP=" + gNP +'\'' + ", gNPOld=" +  gNPOld +'\'' + ", localName=" + localName +
                '\'' + ", governmentForm=" + governmentForm +'\'' + ", headOfState=" +  headOfState + '\'' + ", capital=" + capital +
                '\'' + ", code2=" + code2 + '}';
    }


    // Following statements used for generating getters and setters for the country variables
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }


    public String getRegion() { return region; }

    public void setRegion(String region)
    {
        this.region = region;
    }


    public float getSurfaceArea()
    {
        return surfaceArea;
    }

    public void setSurfaceArea(float surfaceArea)
    {
        this.surfaceArea = surfaceArea;
    }


    public Integer getIndepYear()
    {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear)
    {
        this.indepYear = indepYear;
    }


    public Integer getPopulation()
    {
        return population;
    }

    public void setPopulation(Integer population)
    {
        this.population = population;
    }


    public float getLifeExpectancy()
    {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(float lifeExpectancy)
    {
        this.lifeExpectancy = lifeExpectancy;
    }


    public float getgNP()
    {
        return gNP;
    }

    public void setgNP(float gNP)
    {
        this.gNP = gNP;
    }


    public float getgNPOld()
    {
        return gNPOld;
    }

    public void setgNPOld(float gNPOld)
    {
        this.gNPOld = gNPOld;
    }


    public String getLocalName() { return localName; }

    public void setLocalName(String localName)
    {
        this.localName = localName;
    }


    public String getGovernmentForm() { return governmentForm; }

    public void setGovernmentForm(String region)
    {
        this.governmentForm = governmentForm;
    }


    public String getHeadOfState() { return headOfState; }

    public void setHeadOfState(String region)
    {
        this.headOfState = headOfState;
    }


    public String getCapital() { return capital; }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }


    public String getCode2() { return code2; }

    public void setCode2(String region)
    {
        this.code2 = code2;
    }




}

