package com.napier.sem;

public class Continent{

    // Name.
    public String name;

    // Country constructor init
    public Continent() {}

    public Continent (String name)
    {
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "Continent{" + "name=" + name + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}
