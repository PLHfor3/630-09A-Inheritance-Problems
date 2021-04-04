package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.ProblemOne.ProblemOne;
import com.gmail.prestonhigg17.ProblemThree.SnackBar;
import com.gmail.prestonhigg17.ProblemTwo.ProblemTwo;

import java.util.Scanner;

import static com.gmail.prestonhigg17.Functions.randomFunctions.*;

public class Main
{
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    static ProblemOne problemOne = new ProblemOne();
    static ProblemTwo problemTwo = new ProblemTwo();
    static SnackBar problemThree = new SnackBar();

    public static void main(String[] args)
    {
        run();
    }

    public static void run()
    {
        clearTypingSpace();
        System.out.println("Please type the number of the program you want to run:");
        System.out.println("1. Child Care Database");
        System.out.println("2. Tickets for a Theatre");
        System.out.println("3. Vending Machine System");
        System.out.println("4. Terminate Process");
        System.out.print(" > ");
        int scannerVar = 0;
        try
        {
            scannerVar = Integer.parseInt(scan.next().trim());
        } catch (NumberFormatException e)
        {
            System.err.println("Invalid Input");
        }
        if (scannerVar == 1)
        {
            clearTypingSpace();
            problemOne.problemOne();
        } else if (scannerVar == 2)
        {
            clearTypingSpace();
            problemTwo.problemTwo();
        } else if (scannerVar == 3)
        {
            clearTypingSpace();
            problemThree.run();
        } else if (scannerVar == 4)
        {
            shutdownSequence();
            return;
        }
        waitInSeconds(3);
        pressEnterToContinue();
        run();
    }


}
