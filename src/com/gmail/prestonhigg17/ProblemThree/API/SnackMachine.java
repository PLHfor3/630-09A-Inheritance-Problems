package com.gmail.prestonhigg17.ProblemThree.API;

public class SnackMachine extends VendingMachine
{
    private final String[] snackNames = {"Mike and Ike", "Corn Nuts", "Pringles", "Doritos", "Donuts", "Crackers", "Pretzles", "Cheez its", "Fritos", "Chocolate Chip Cookies", "Popcorn", "Muffin", "Beef Jerky", "Crunch Bar", "Ritz Crackers", "Saltine Crackers", "Cliff Bar", "Brownie", "Mac & Cheese", "Oreos", "Cheetos", "Lay's", "Sun Chips", "Chocolate Pretzels",};
    private Integer[][] snackStock = new Integer[24][1];
    private double price[][] = new double[24][1];

    public SnackMachine()
    {
        for (int index = 0; index < snackStock.length; index++)
        {
            snackStock[index][0] = 1;
            price[index][0] = 0.75;
        }
    }

    public void setPrice(double itemPrice, int index)
    {
        price[index][0] = itemPrice;
    }

    public boolean buy(int index)
    {
        if (snackStock[index][0] > 0)
        {
            snackStock[index][0] -= 1;
            return true;
        }
        return false;
    }

    public double getPrice(int index)
    {
        return price[index][0];
    }

    public void addStock(int index, int amountOfStockToAdd)
    {
        if ((snackStock[index][0] + amountOfStockToAdd) <= 1 && amountOfStockToAdd >= 0)
        {
            if (snackStock[index][index] <= 1)
            {
                snackStock[index][0] = snackStock[index][0] + amountOfStockToAdd;
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

    public String[] getSnackNames()
    {
        return snackNames;
    }

    public String getSnackName(int index)
    {
        return snackNames[index];
    }

    public void setSnackName(int index, String snackName)
    {
        snackNames[index] = snackName;
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


}
