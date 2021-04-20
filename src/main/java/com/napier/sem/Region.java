package com.napier.sem;

public class Region {

    // Name.
    public String name;

    // Country constructor init
    public Region() {}

    public Region (String name)
    {
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "Region{" + "name=" + name + '}';
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
