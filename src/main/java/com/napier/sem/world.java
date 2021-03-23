package com.napier.sem;


// This class is used to extract information out from cities in the world.sql database



public class world {

        // City Identification number
        public int id;

        // City name
        public String name;

        // City country code
        public String countryCode;

        // City district
        public String district;

        // City population
        public int population;



        // world constructor init
        public world() {}
        public world (int id,String name,String countryCode,String district,int population)
        {
                this.id=id;
                this.name=name;
                this.countryCode=countryCode;
                this.district=district;
                this.population=population;
        }


        @Override
        public String toString()
        {
                return "City{" + "id=" + id + ", name='" + name + '\'' + ", countryCode='" + countryCode + '\'' +
                        ", district='" + district + '\'' + ", population=" + population + '}';
        }


        // Following statements used for generating getters and setters for the city variables
        public Integer getId()
        {
                return id;
        }

        public void setId(Integer id)
        {
                this.id = id;
        }


        public String getName()
        {
                return name;
        }

        public void setName(String name)
        {
                this.name = name;
        }


        public String getCountryCode()
        {
                return countryCode;
        }

        public void setCountryCode(String countryCode)
        {
                this.countryCode = countryCode;
        }


        public String getDistrict()
        {
                return district;
        }

        public void setDistrict(String district)
        {
                this.district = district;
        }


        public Integer getPopulation()
        {
                return population;
        }

        public void setPopulation(Integer population)
        {
                this.population = population;
        }
}

