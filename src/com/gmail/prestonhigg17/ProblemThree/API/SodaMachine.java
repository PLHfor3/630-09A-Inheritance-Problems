package com.gmail.prestonhigg17.ProblemThree.API;

public class SodaMachine extends VendingMachine
{
    private final String[] sodaNames = {"Pepsi", "Coke", "Dr. Pepper", "Orange", "Mountain Dew", "Water",};
    private Integer[][] isThereStock = new Integer[6][1];
    private Integer[][] temperature = new Integer[6][1];
    private double price[][] = new double[6][1];

    public void addStock(int index, int amountOfStockToAdd)
    {
        if ((isThereStock[index][0] + amountOfStockToAdd) <= 20 && amountOfStockToAdd >= 0)
        {
            if (isThereStock[index][index] <= 20)
            {
                isThereStock[index][0] = isThereStock[index][0] + amountOfStockToAdd;
            } else
            {
                System.out.println("MACHINE ALREADY FULL!");
                return;
            }
        } else
        {
            System.out.println("ERROR: CAN NOT ADD THAT MUCH STOCK OR YOU HAVE ENTERED A NEGATIVE VALUE FOR STOCK ");
        }
    }

    public int getTemperatureAtIndex(int index)
    {
        return temperature[index][0];
    }

    public double getPrice(int index)
    {
        return price[index][0];
    }

    public void setPrice(int index, double doublePrice)
    {
        price[index][0] = doublePrice;
    }
}
