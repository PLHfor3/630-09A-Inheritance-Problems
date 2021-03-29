package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.ProblemThree.API.CandyMachine;

public class Main
{
    public static void main(String[] args)
    {
        //Executer.problemOne();
        //SnackBar.run();


        CandyMachine candyMachine = new CandyMachine();
        candyMachine.printTest();
    }


    private static void pressEnterToContinue()
    {
        System.out.println("\nPress Enter key to continue...");
        try
        {
            System.in.read();
        } catch (Exception e)
        {
        }
    }

    public static void clearTypingSpace()
    {
        int typeSpaceClear = 0;
        while (typeSpaceClear < 80)
        {
            System.out.print("\n");
            typeSpaceClear++;
        }
    }

    private static void wait(int seconds)
    {
        int time = seconds * 1000;
        try
        {
            Thread.sleep(time);
        } catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
