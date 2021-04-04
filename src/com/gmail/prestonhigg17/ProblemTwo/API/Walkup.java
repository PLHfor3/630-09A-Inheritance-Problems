package com.gmail.prestonhigg17.ProblemTwo.API;

public class Walkup extends Ticket
{
    private final int walkupCost = 50;

    @Override
    public double getPrice()
    {
        return walkupCost;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
