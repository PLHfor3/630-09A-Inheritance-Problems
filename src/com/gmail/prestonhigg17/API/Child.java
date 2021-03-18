package com.gmail.prestonhigg17.API;

public class Child extends Person
{
    private Person guardian;
    private int age;
    private int height;
    private double weight;

    public void setGuardian(Person guardian)
    {
        this.guardian = guardian;
    }

    public Person getGuardian()
    {
        return guardian;
    }

    public String toString()
    {
        return "Child's Name: " + getFirstName() + " " + getLastName() +
                "\nChild's Mother: " + getMother() +
                "\nChild's Father: " + getFather() +
                "\nChild's Age" + age
                ;
    }

}
