package com.gmail.prestonhigg17.ProblemTwo.API;

public class Advance extends Ticket
{
    private final int advanceCostTenPlus = 30;
    private final int advanceCostTenLess = 40;
    private double price;

    public Advance(int daysInAdvance)
    {
        if (daysInAdvance >= 10)
        {
            price = advanceCostTenPlus;
        } else
        {
            price = advanceCostTenLess;
        }
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
