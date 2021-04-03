package com.gmail.prestonhigg17.ProblemThree.API;

public class VendingMachine
{
    public double changePaymentModule(double price, int pennies, int nickels, int dimes, int quarters, boolean displayPayment)
    {
        double payment = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        if (displayPayment == true)
        {
            System.out.println("Payment given: $" + (String.format("%,.2f", payment)));
        }
        return payment - price;
    }

    public double cashPaymentModule(double price, int oneDollarBills, int twoDollarBills, int fiveDollarBills, boolean displayPayment)
    {
        double payment = (oneDollarBills * 1.00) + (twoDollarBills * 2.00) + (fiveDollarBills * 5.00);
        if (displayPayment == true)
        {
            System.out.println("Payment given: $" + (String.format("%,.2f", payment)));
        }
        return payment - price;
    }

    public double payWithBoth(double price, int pennies, int nickels, int dimes, int quarters, int oneDollarBills, int twoDollarBills, int fiveDollarBills, boolean displayPeyment)
    {
        double changeNeededToReturn = changePaymentModule(price, pennies, nickels, dimes, quarters, false);
        double cashNeededToReturn = cashPaymentModule(price, oneDollarBills, twoDollarBills, fiveDollarBills, false);
        return 0;
    }
}
