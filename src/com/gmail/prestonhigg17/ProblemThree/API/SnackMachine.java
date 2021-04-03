package com.gmail.prestonhigg17.ProblemThree.API;

public class SnackMachine extends VendingMachine
{
    private final String[] snackNames = {"Mike and Ike", "Corn Nuts", "Pringles", "Doritos", "Donuts", "Crackers", "Pretzles", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",};
    private Integer[][] snackStock = new Integer[24][1];
    private double price[][] = new double[24][1];

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


}
