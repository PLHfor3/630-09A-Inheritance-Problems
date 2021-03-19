package com.gmail.prestonhigg17.API;

public class Guardian extends Person
{
    private String phoneNumber;
    private String relationshipToChild;

    public void setPhoneNumber(String number)
    {
        this.phoneNumber = number;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setRelationshipToChild(String relationshipToChild)
    {
        this.relationshipToChild = relationshipToChild;
    }

    public String getRelationshipToChild()
    {
        return relationshipToChild;
    }

    public String toString()
    {
        return "test";
    }
}
