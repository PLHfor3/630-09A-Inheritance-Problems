package com.gmail.prestonhigg17.Functions;

public class randomFunctions
{
    public static void pressEnterToContinue()
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

    public static void waitInSeconds(double seconds)
    {
        int time = (int) (seconds * 1000);
        try
        {
            Thread.sleep(time);
        } catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void shutdownSequence()
    {
        System.out.print("S");
        waitInSeconds(0.2);
        System.out.print("h");
        waitInSeconds(0.2);
        System.out.print("u");
        waitInSeconds(0.2);
        System.out.print("t");
        waitInSeconds(0.2);
        System.out.print("t");
        waitInSeconds(0.2);
        System.out.print("i");
        waitInSeconds(0.2);
        System.out.print("n");
        waitInSeconds(0.2);
        System.out.print("g");
        waitInSeconds(0.2);
        System.out.print(" ");
        waitInSeconds(0.2);
        System.out.print("D");
        waitInSeconds(0.2);
        System.out.print("o");
        waitInSeconds(0.2);
        System.out.print("w");
        waitInSeconds(0.2);
        System.out.print("n");
        waitInSeconds(0.5);
        System.out.print(".");
        waitInSeconds(0.5);
        System.out.print(".");
        waitInSeconds(0.5);
        System.out.print(".");
        waitInSeconds(1);
    }
}
