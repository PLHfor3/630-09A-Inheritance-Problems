package com.gmail.prestonhigg17.ProblemThree.API;

public class CandyMachine extends VendingMachine
{
    private final String[] candyNames = {"Milk Chocolate", "Dark Chocolate", "Twizzler", "KitKat", "M&M", "Reese's", "Skittles", "Smarties", "Sour Patch Kids",};
    private Integer[][] isThereStock = new Integer[9][1];
    private double price[][] = new double[9][1];

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


    public void printTest()
    {
        System.out.println(candyNames[1] + " " + candyNames[0] + " " + isThereStock[0][0]);
    }
}

