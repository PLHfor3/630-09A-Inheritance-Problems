package com.gmail.prestonhigg17.Functions;

public class misc
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

    public static void waitInSeconds(int seconds)
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
