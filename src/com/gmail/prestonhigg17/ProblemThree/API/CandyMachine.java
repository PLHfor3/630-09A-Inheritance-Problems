package com.gmail.prestonhigg17.ProblemThree.API;

public class CandyMachine extends VendingMachine
{
    private final String[] candyNames = {"Milk Chocolate", "Dark Chocolate", "Twizzler", "KitKat", "M&M", "Reese's", "Skittles", "Smarties", "Sour Patch Kids",};
    private Integer[][] isThereStock = new Integer[9][1];
    private double price[][] = new double[9][1];

    public CandyMachine()
    {
        for (int index = 0; index < isThereStock.length; index++)
        {
            isThereStock[index][0] = 9;
            price[index][0] = 1.00;
        }
    }

    public int getstock(int index)
    {
        return isThereStock[index][0];
    }

    public void addStock(int index, int amountOfStockToAdd)
    {
        if ((isThereStock[index][0] + amountOfStockToAdd) <= 9 && amountOfStockToAdd >= 0)
        {
            if (isThereStock[index][index] <= 9)
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

    public boolean buy(int index)
    {
        if (isThereStock[index][0] > 0)
        {
            isThereStock[index][0] -= 1;
            return true;
        }
        return false;
    }

    public void setPrice(double priceW, int index)
    {
        price[index][0] = priceW;
    }

    public double getPrice(int index)
    {
        return price[index][0];
    }

    public double[] getPrices()
    {
        double[] prices = new double[price.length];
        for (int index = 0; index < price.length; index++)
        {
            prices[index] = price[index][0];
        }
        return prices;
    }

    public String[] getCandyNames()
    {
        return candyNames;
    }

    public String getCandyName(int index)
    {
        return candyNames[index];
    }

    public void printTest()
    {
        System.out.println(candyNames[1] + " " + candyNames[0] + " " + isThereStock[0][0]);
    }
}

