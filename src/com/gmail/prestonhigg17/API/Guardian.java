package com.gmail.prestonhigg17.API;

public class Guardian extends Person
{
    private Person guardian;
    private String phoneNumber;
    private String relationship;

    public void setPhoneNumber(String number)
    {
        this.phoneNumber = number;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String toString()
    {
        return "";
    }
}
