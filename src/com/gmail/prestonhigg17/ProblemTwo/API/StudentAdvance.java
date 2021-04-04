package com.gmail.prestonhigg17.ProblemTwo.API;

public class StudentAdvance extends Advance
{
    private double price;

    public StudentAdvance(int daysInAdvance)
    {
        super(daysInAdvance);
        price = super.getPrice() / 2;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        System.out.println("(Student ID Required)");
        return super.toString();
    }
}
