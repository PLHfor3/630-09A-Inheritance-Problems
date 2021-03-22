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

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }

    public String toString()
    {
        return "Child's Name: " + getFirstName() + " " + getLastName() +
                "\nChild's Mother: " + getMother() +
                "\nChild's Father: " + getFather() +
                "\nChild's Guardian: " + guardian +
                "\nChild's Age: " + age +
                "\nChild's Weight: " + weight + " lbs" +
                "\nChild's Height: " + height + " inches" +
                "\n"
                ;
    }

}
