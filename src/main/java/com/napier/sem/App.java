package com.napier.sem;



import java.sql.*;
import java.util.ArrayList;


//Main class for connecting to a local database
public class App {

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }



    public static void main(String args[]) throws SQLException {
        // Create new Application
        App a = new App();

        // Connect to databas
        a.connect();

        //issue N35
        //a.printCountries(a.getCountryListByWorld());

        //issue N29
        a.printCities(a.getCityListByWorld());

        // Disconnect from database
        a.disconnect();
    }


    public ArrayList<Country> getCountryListByWorld()
    {

        try
    {
        // Make string used for sql statement
        String strSelect = "SELECT country.code, country.name, country.continent, country.region, country.population," +
                " city.name as 'Capital' FROM country, city where country.capital = city.id ORDER BY Population DESC;";
        PreparedStatement stmt = con.prepareStatement(strSelect);

        // Execute SQL statement
        ResultSet rset = stmt.executeQuery();


        // Creating array list of class country
        ArrayList<Country> countries  = new ArrayList<>();


        // Check one is returned
        while (rset.next())
        {
            Country cntr = new Country();
            cntr.code = rset.getString("code");
            cntr.name = rset.getString("name");
            cntr.continent = rset.getString("continent");
            cntr.region = rset.getString("region");
            cntr.population = rset.getInt("population");
            cntr.capital = rset.getString("capital");
            countries.add(cntr);
        }
        return countries;
    }
    catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Cities> getCityListByWorld()
    {

        try
        {
            // Make string used for sql statement
            String strSelect = "SELECT city.id, city.name, city.countrycode, city.district, city.population FROM city ORDER BY Population DESC;";
            PreparedStatement stmt = con.prepareStatement(strSelect);

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery();


            // Creating array list of class Cities
            ArrayList<Cities> towns  = new ArrayList<>();


            // Check one is returned
            while (rset.next())
            {
                Cities city = new Cities();
                city.id = rset.getInt("id");
                city.name = rset.getString("name");
                city.countryCode = rset.getString("countrycode");
                city.district = rset.getString("district");
                city.population = rset.getInt("population");
                towns.add(city);
            }

            return towns;

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public void printCountries(ArrayList<Country> countries)
    {
        // Spacing out data for user accessibility
        System.out.println(String.format("%-20s %-50s %-20s %-35s %-15s %-15s",
                "Country Code", "Country Name", "Country Continent", "Country Region", "Country Population", "Country Capital"));

        for(Country country : countries)
        {
            String country_data =
                    String.format("%-20s %-50s %-20s %-35s %-15s %-15s",
                            country.code, country.name, country.continent, country.region, country.population, country.capital);
            System.out.println(country_data);
        }
    }

    public void printCities(ArrayList<Cities> cities)
    {
        // Spacing out data for user accessibility
        System.out.println(String.format("%-10s %-35s %-20s %-25s %-15s",
                "City ID", "City Name", "City Country Code", "City District", "City Population"));

        for(Cities city : cities)
        {
            String city_data =
                    String.format("%-10s %-35s %-20s %-25s %-15s",
                            city.id, city.name, city.countryCode, city.district, city.population);
            System.out.println(city_data);
        }
    }
}
