package com.gmail.prestonhigg17.ProblemThree.API;

public class CandyMachine extends VendingMachine
{
    private final String[] candyNames = {"Milk Chocolate", "Dark Chocolate", "Twizzler", "KitKat", "M&M", "Reese's", "Skittles", "Smarties", "Sour Patch Kids",};
    private boolean[][] isThereStock = new boolean[9][9];


    public void printTest()
    {
        System.out.println(candyNames[1] + " " + candyNames[0] + " " + isThereStock[0][0]);
    }

    public void test(int index, boolean test)
    {
        return;
    }
}

