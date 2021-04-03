package com.gmail.prestonhigg17.ProblemThree;

import com.gmail.prestonhigg17.Algorithms.MyStringBuilderMethods;
import com.gmail.prestonhigg17.ProblemThree.API.CandyMachine;
import com.gmail.prestonhigg17.ProblemThree.API.SnackMachine;
import com.gmail.prestonhigg17.ProblemThree.API.SodaMachine;
import com.gmail.prestonhigg17.ProblemThree.API.VendingMachine;

import java.util.Scanner;

import static com.gmail.prestonhigg17.Functions.misc.*;

public class SnackBar
{
    CandyMachine candyMachine = new CandyMachine();
    SnackMachine snackMachine = new SnackMachine();
    SodaMachine sodaMachine = new SodaMachine();
    VendingMachine vendingMachine = new VendingMachine();

    private final String password = "cougars";

    MyStringBuilderMethods build = new MyStringBuilderMethods();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void run()
    {
        clearTypingSpace();
        System.out.print("Please select a machine. Available Types are Candy, Soda, and Snack: ");
        String scannerString = scan.next();
        if (scannerString.equalsIgnoreCase("candy") || scannerString.equalsIgnoreCase("soda") || scannerString.equalsIgnoreCase("snack") || scannerString.equalsIgnoreCase("manager"))
        {
            if (scannerString.equalsIgnoreCase("candy"))
            {
                runCandyMachine();
            } else if (scannerString.equalsIgnoreCase("snack"))
            {
                runSnackMachine();
            } else if (scannerString.equalsIgnoreCase("manager"))
            {
                clearTypingSpace();
                System.out.println("Please enter the admin password: ");
                String passwordInput = scan.next();
                if (passwordInput.equalsIgnoreCase(password))
                {
                    manager();
                } else
                {
                    System.out.println("Authentication failed");
                    waitInSeconds(2);
                    pressEnterToContinue();
                    waitInSeconds(2);
                    run();
                }
            } else if (scannerString.equalsIgnoreCase("soda"))
            {
                runSodaMachine();
            }
        } else
        {
            System.out.println("Not a valid input. Try again.");
            pressEnterToContinue();
            run();
        }
    }

    public void runCandyMachine()
    {
        clearTypingSpace();
        candyMachine.setPrice(1.25, 0);
        System.out.println("Please select the candy you would like from the list below: ");
        System.out.println(build.arrayToString(candyMachine.getCandyNames()));
        System.out.println(build.doubleArrayToString(candyMachine.getPrices()));
        System.out.print(" > ");
        String scannerString = scan.next();


        if (build.doesArrayContainValue(candyMachine.getCandyNames(), scannerString))
        {
            clearTypingSpace();
            String nameOfCandy = candyMachine.getCandyName(build.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString));
            System.out.println("Please enter the amount of pennies");
            System.out.print(" > ");
            int pennies = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of nickels");
            System.out.print(" > ");
            int nickels = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of dimes");
            System.out.print(" > ");
            int dimes = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of quarters");
            System.out.print(" > ");
            int quarters = Integer.parseInt(scan.next());
            clearTypingSpace();
            candyMachine.addStock(0, 9);
            if (candyMachine.buy(build.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)))
            {
                candyMachine.changePaymentModule(candyMachine.getPrice(build.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)), pennies, nickels, dimes, quarters, true);
                System.out.println("Change Returned: $" + String.format("%, .2f", candyMachine.changePaymentModule(candyMachine.getPrice(build.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)), pennies, nickels, dimes, quarters, false)));
            } else
            {
                System.out.println("Out of Stock. Purchase not successful");
                System.out.println("Change Returned: $" + String.format("%, .2f", candyMachine.changePaymentModule(0, pennies, nickels, dimes, quarters, true)));
            }
        } else
        {
            System.out.println("INVALID INPUT");
            waitInSeconds(2);
            runCandyMachine();
        }

    }

    private void runSodaMachine()
    {
        clearTypingSpace();
    }

    private void runSnackMachine()
    {
        clearTypingSpace();
    }

    public void manager()
    {

    }
}
