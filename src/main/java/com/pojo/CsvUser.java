package com.pojo;

import com.opencsv.bean.CsvBindByName;

public class CsvUser
{
    @CsvBindByName
    private String name;

    @CsvBindByName (column =" email",required = true)
    private String email;

    @CsvBindByName(column = "phoneNo")
    private String phoneNo;

    @CsvBindByName
    private String country;

    public CsvUser(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phoneNo;
    }

    public String getCountry()
    {
        return country;
    }
}
