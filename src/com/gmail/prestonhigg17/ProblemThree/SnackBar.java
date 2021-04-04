package com.gmail.prestonhigg17.ProblemThree;

import com.gmail.prestonhigg17.Algorithms.MyStringBuilderMethods;
import com.gmail.prestonhigg17.ProblemThree.API.CandyMachine;
import com.gmail.prestonhigg17.ProblemThree.API.SnackMachine;
import com.gmail.prestonhigg17.ProblemThree.API.SodaMachine;
import com.gmail.prestonhigg17.ProblemThree.API.VendingMachine;

import java.util.Scanner;

import static com.gmail.prestonhigg17.Functions.randomFunctions.*;

public class SnackBar
{
    CandyMachine candyMachine = new CandyMachine();
    SnackMachine snackMachine = new SnackMachine();
    SodaMachine sodaMachine = new SodaMachine();
    VendingMachine vendingMachine = new VendingMachine();

    private final String password = "Cougars1";

    MyStringBuilderMethods stringBuilder = new MyStringBuilderMethods();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void run()
    {
        clearTypingSpace();
        System.out.print("Please select a machine. Available Types are Candy, Soda, and Snack (or type exit to exit, this may need to be typed twice): ");
        String scannerString = scan.next();
        if (scannerString.equalsIgnoreCase("candy") || scannerString.equalsIgnoreCase("soda") || scannerString.equalsIgnoreCase("snack") || scannerString.equalsIgnoreCase("manager") || scannerString.equalsIgnoreCase("exit"))
        {
            if (scannerString.equalsIgnoreCase("exit"))
            {
                return;
            }
            if (scannerString.equalsIgnoreCase("candy"))
            {
                runCandyMachine();
                run();
            } else if (scannerString.equalsIgnoreCase("snack"))
            {
                runSnackMachine();
                run();
            } else if (scannerString.equalsIgnoreCase("manager"))
            {
                clearTypingSpace();
                System.out.println("Please enter the admin password: ");
                String passwordInput = scan.next();
                if (passwordInput.equals(password))
                {
                    manager();
                    run();
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
                run();
            }
        } else
        {
            System.out.println("Not a valid input. Try again.");
            pressEnterToContinue();
            run();
        }
    }

    private void runCandyMachine()
    {
        clearTypingSpace();
        System.out.println("Please select the candy you would like from the list below (or type exit to exit, this may need to be typed twice): ");
        System.out.println(stringBuilder.arrayToString(candyMachine.getCandyNames()));
        /* Third argument defines where label should be placed in the method below
         *  If true label will be placed before value
         *  If false label will be placed after value */
        System.out.println(stringBuilder.doubleArrayToString(candyMachine.getPrices(), "$", true));
        System.out.print(" > ");
        String scannerString = scan.next();

        if (scannerString.equalsIgnoreCase("exit"))
        {
            return;
        }


        if (stringBuilder.doesArrayContainValue(candyMachine.getCandyNames(), scannerString))
        {
            clearTypingSpace();
            String nameOfCandy = candyMachine.getCandyName(stringBuilder.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString));
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

            if (candyMachine.changePaymentModule(candyMachine.getPrice(stringBuilder.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)), pennies, nickels, dimes, quarters, false) == -1)
            {
                if (candyMachine.buy(stringBuilder.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)))
                {
                    candyMachine.changePaymentModule(candyMachine.getPrice(stringBuilder.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)), pennies, nickels, dimes, quarters, true);
                    System.out.println("Change Returned: $" + String.format("%,.2f", candyMachine.changePaymentModule(candyMachine.getPrice(stringBuilder.whatIsTheIndexOfName(candyMachine.getCandyNames(), scannerString)), pennies, nickels, dimes, quarters, false)));
                } else
                {
                    System.out.println("Out of Stock. Purchase not successful");
                    System.out.println("Change Returned: $" + String.format("%,.2f", candyMachine.changePaymentModule(0, pennies, nickels, dimes, quarters, true)));
                    waitInSeconds(5);
                    runCandyMachine();
                }
            } else
            {
                System.out.println("Invalid Payment");
                System.out.println("Change Returned: $" + String.format("%,.2f", candyMachine.changePaymentModule(0, pennies, nickels, dimes, quarters, false)));
                waitInSeconds(5);
                runCandyMachine();
            }
        } else
        {
            System.out.println("INVALID INPUT");
            waitInSeconds(2);
            runCandyMachine();
        }

        runCandyMachine();

    }

    private void runSodaMachine()
    {
        clearTypingSpace();
        System.out.println("Please select the soda you would like from the list below (or type exit to exit, this may need to be typed twice): ");
        System.out.println(stringBuilder.arrayToString(sodaMachine.getSodaNames()));
        System.out.println(stringBuilder.doubleArrayToString(sodaMachine.getPrices(), "$", true));
        System.out.println(stringBuilder.doubleArrayToString(sodaMachine.getTemperatures(), "°F", false));
        System.out.print(" > ");
        String scannerString = scan.next();

        if (scannerString.equalsIgnoreCase("exit"))
        {
            return;
        }

        if (stringBuilder.doesArrayContainValue(sodaMachine.getSodaNames(), scannerString))
        {
            clearTypingSpace();
            String nameOfSoda = sodaMachine.getSodaName(stringBuilder.whatIsTheIndexOfName(sodaMachine.getSodaNames(), scannerString));
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
            System.out.println("Please enter the amount of $1 bills");
            System.out.print(" > ");
            int ones = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of $2 bills");
            System.out.print(" > ");
            int twos = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of $5 bills");
            System.out.print(" > ");
            int fives = Integer.parseInt(scan.next());
            clearTypingSpace();

            if (sodaMachine.payModule(sodaMachine.getPrice(stringBuilder.whatIsTheIndexOfName(sodaMachine.getSodaNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, false) != -1)
            {
                if (sodaMachine.buy(stringBuilder.whatIsTheIndexOfName(sodaMachine.getSodaNames(), scannerString)))
                {
                    sodaMachine.payModule(sodaMachine.getPrice(stringBuilder.whatIsTheIndexOfName(sodaMachine.getSodaNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, true);
                    System.out.println("Change Returned: $" + String.format("%,.2f", sodaMachine.payModule(sodaMachine.getPrice(stringBuilder.whatIsTheIndexOfName(sodaMachine.getSodaNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, false)));
                } else
                {
                    System.out.println("Out of Stock. Purchase not successful");
                    System.out.println("Change Returned: $" + String.format("%,.2f", sodaMachine.payModule(0, pennies, nickels, dimes, quarters, ones, twos, fives, true)));
                    waitInSeconds(5);
                    runSodaMachine();

                }
            } else
            {
                System.out.println("Invalid Payment");
                System.out.println("Change Returned: $" + String.format("%,.2f", sodaMachine.payModule(0, pennies, nickels, dimes, quarters, ones, twos, fives, true)));
                waitInSeconds(5);
                runSodaMachine();
            }
        } else
        {
            System.out.println("INVALID INPUT");
            waitInSeconds(2);
            runSodaMachine();
        }
        runSodaMachine();
    }

    private void runSnackMachine()
    {
        clearTypingSpace();
        System.out.println("Please select the snack you would like from the list below (or type exit to exit, this may need to be typed twice): ");
        System.out.println(stringBuilder.arrayToString(snackMachine.getSnackNames()));
        System.out.println(stringBuilder.doubleArrayToString(snackMachine.getPrices(), "$", true));
        System.out.print(" > ");
        String scannerString = scan.next();

        if (scannerString.equalsIgnoreCase("exit"))
        {
            return;
        }

        if (stringBuilder.doesArrayContainValue(snackMachine.getSnackNames(), scannerString))
        {
            clearTypingSpace();
            String nameOfSnack = snackMachine.getSnackName(stringBuilder.whatIsTheIndexOfName(snackMachine.getSnackNames(), scannerString));
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
            System.out.println("Please enter the amount of $1 bills");
            System.out.print(" > ");
            int ones = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of $2 bills");
            System.out.print(" > ");
            int twos = Integer.parseInt(scan.next());
            clearTypingSpace();
            System.out.println("Please enter the amount of $5 bills");
            System.out.print(" > ");
            int fives = Integer.parseInt(scan.next());
            clearTypingSpace();

            if (snackMachine.payModule(snackMachine.getPrice(stringBuilder.whatIsTheIndexOfName(snackMachine.getSnackNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, false) != -1)
            {
                if (snackMachine.buy(stringBuilder.whatIsTheIndexOfName(snackMachine.getSnackNames(), scannerString)))
                {
                    snackMachine.payModule(snackMachine.getPrice(stringBuilder.whatIsTheIndexOfName(snackMachine.getSnackNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, true);
                    System.out.println("Change Returned: $" + String.format("%,.2f", snackMachine.payModule(snackMachine.getPrice(stringBuilder.whatIsTheIndexOfName(snackMachine.getSnackNames(), scannerString)), pennies, nickels, dimes, quarters, ones, twos, fives, false)));
                } else
                {
                    System.out.println("Out of Stock. Purchase not successful");
                    System.out.println("Change Returned: $" + String.format("%,.2f", snackMachine.payModule(0, pennies, nickels, dimes, quarters, ones, twos, fives, true)));
                    waitInSeconds(5);
                    runSnackMachine();
                }
            } else
            {
                System.out.println("Invalid Payment");
                System.out.println("Change Returned: $" + String.format("%,.2f", snackMachine.payModule(0, pennies, nickels, dimes, quarters, ones, twos, fives, true)));
                waitInSeconds(5);
                runSnackMachine();
            }
        } else
        {
            System.out.println("INVALID INPUT");
            waitInSeconds(2);
            runSnackMachine();
        }
        runSnackMachine();
    }

    private void manager()
    {
        clearTypingSpace();
        System.out.print("[ADMIN] Please select a machine to edit stock or prices. Available Types are Candy, Soda, and Snack: ");
        String scannerString = scan.next();
        if (scannerString.equalsIgnoreCase("candy") || scannerString.equalsIgnoreCase("soda") || scannerString.equalsIgnoreCase("snack") || scannerString.equalsIgnoreCase("exit"))
        {
            if (scannerString.equalsIgnoreCase("exit"))
            {
                return;
            }

            if (scannerString.equalsIgnoreCase("candy"))
            {
                clearTypingSpace();
                System.out.println("[ADMIN] Please select a settings. setPrice or addStock");
                String adminSelector = scan.next();
                if (adminSelector.equalsIgnoreCase("setPrice"))
                {
                    System.out.println(stringBuilder.arrayToString(candyMachine.getCandyNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to update price: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the desired price to update: ");
                    double itemPrice = Double.parseDouble(scan.next());
                    candyMachine.setPrice(itemPrice, index);
                } else if (adminSelector.equalsIgnoreCase("addStock"))
                {
                    System.out.println(stringBuilder.arrayToString(candyMachine.getCandyNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to add stock: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the amount of stock to add: ");
                    int itemQuantity = Integer.parseInt(scan.next());
                    candyMachine.addStock(index, itemQuantity);
                } else
                {
                    System.out.println("[ADMIN] Invalid Selection");
                    waitInSeconds(2);
                    manager();
                }

            } else if (scannerString.equalsIgnoreCase("soda"))
            {
                clearTypingSpace();
                System.out.println("[ADMIN] Please select a settings. setPrice or addStock");
                String adminSelector = scan.next();
                if (adminSelector.equalsIgnoreCase("setPrice"))
                {
                    System.out.println(stringBuilder.arrayToString(sodaMachine.getSodaNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to update price: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the desired price to update: ");
                    double itemPrice = Double.parseDouble(scan.next());
                    sodaMachine.setPrice(index, itemPrice);
                } else if (adminSelector.equalsIgnoreCase("addStock"))
                {
                    System.out.println(stringBuilder.arrayToString(sodaMachine.getSodaNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to add stock: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the amount of stock to add: ");
                    int itemQuantity = Integer.parseInt(scan.next());
                    sodaMachine.addStock(index, itemQuantity);
                } else
                {
                    System.out.println("[ADMIN] Invalid Selection");
                    waitInSeconds(2);
                    manager();
                }

            } else if (scannerString.equalsIgnoreCase("snack"))
            {
                clearTypingSpace();
                System.out.println("[ADMIN] Please select a settings: [setPrice or addStock]");
                String adminSelector = scan.next();
                if (adminSelector.equalsIgnoreCase("setPrice"))
                {
                    System.out.println(stringBuilder.arrayToString(snackMachine.getSnackNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to update price: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the desired price to update: ");
                    double itemPrice = Double.parseDouble(scan.next());
                    snackMachine.setPrice(itemPrice, index);
                } else if (adminSelector.equalsIgnoreCase("addStock"))
                {
                    System.out.println(stringBuilder.arrayToString(snackMachine.getSnackNames()));
                    System.out.print("[ADMIN] Please enter the desired slot number for the item you wish to add stock: ");
                    int index = Integer.parseInt(scan.next());
                    clearTypingSpace();
                    System.out.print("[ADMIN] Please enter the amount of stock to add: ");
                    int itemQuantity = Integer.parseInt(scan.next());
                    snackMachine.addStock(index, itemQuantity);
                } else
                {
                    System.out.println("[ADMIN] Invalid Selection");
                    waitInSeconds(2);
                    manager();
                }

            } else
            {
                System.out.println("[ADMIN] Invalid Selection");
                waitInSeconds(2);
                manager();
            }
        }
        manager();
    }
}
