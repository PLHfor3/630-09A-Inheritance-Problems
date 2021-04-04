package com.gmail.prestonhigg17.ProblemTwo;

import com.gmail.prestonhigg17.ProblemTwo.API.Advance;
import com.gmail.prestonhigg17.ProblemTwo.API.StudentAdvance;
import com.gmail.prestonhigg17.ProblemTwo.API.Ticket;
import com.gmail.prestonhigg17.ProblemTwo.API.Walkup;

import java.util.ArrayList;
import java.util.Scanner;

import static com.gmail.prestonhigg17.Functions.randomFunctions.clearTypingSpace;
import static com.gmail.prestonhigg17.Functions.randomFunctions.waitInSeconds;

public class ProblemTwo
{
    private int totalTicketsRemaining = 10;
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Ticket> ticketArrayList = new ArrayList<>();

    public void problemTwo()
    {
        if (totalTicketsRemaining > 6)
        {
            System.out.println("You are purchasing a ticket greater than 10 days in advance");
            System.out.println("Price: Student = $15    Normal = $30");
            System.out.println("Please select your ticket type: Student or Normal (or type exit to exit, this may need to be typed twice)");
            System.out.print(" > ");
            String scannerVar = scan.next().trim();
            if (scannerVar.equalsIgnoreCase("student"))
            {
                System.out.println("Purchase made successfully");
                ticketArrayList.add(new StudentAdvance(12));
                totalTicketsRemaining--;
            } else if (scannerVar.equalsIgnoreCase("normal"))
            {
                System.out.println("Purchase made successfully");
                ticketArrayList.add(new Advance(12));
                totalTicketsRemaining--;
            } else if (scannerVar.equalsIgnoreCase("exit"))
            {
                return;
            } else
            {
                System.out.println("Invalid Input");
                waitInSeconds(3);
                problemTwo();
            }
        } else if (totalTicketsRemaining > 3)
        {
            System.out.println("You are purchasing a ticket less than 10 days in advance (or type exit to exit, this may need to be typed twice)");
            System.out.println("Price: Student = $20    Normal = $40");
            System.out.println("Please select your ticket type: Student or Normal");
            System.out.print(" > ");
            String scannerVar = scan.next().trim();
            if (scannerVar.equalsIgnoreCase("student"))
            {
                System.out.println("Purchase made successfully");
                ticketArrayList.add(new StudentAdvance(8));
                totalTicketsRemaining--;
            } else if (scannerVar.equalsIgnoreCase("normal"))
            {
                System.out.println("Purchase made successfully");
                ticketArrayList.add(new Advance(8));
                totalTicketsRemaining--;
            } else if (scannerVar.equalsIgnoreCase("exit"))
            {
                return;
            } else
            {
                System.out.println("Invalid Input");
                waitInSeconds(3);
                problemTwo();
            }
        } else if (totalTicketsRemaining != 0)
        {
            System.out.println("You are purchasing a walkup ticket (or type exit to exit, this may need to be typed twice)");
            System.out.println("Price: Student = $50    Normal = $50");
            System.out.println("Would you like to make the purchase: Yes or No");
            System.out.print(" > ");
            String scannerVar = scan.next().trim();
            if (scannerVar.equalsIgnoreCase("Yes"))
            {
                System.out.println("Purchase made successfully");
                ticketArrayList.add(new Walkup());
                totalTicketsRemaining--;
            } else if (scannerVar.equalsIgnoreCase("No"))
            {
                problemTwo();
            } else if (scannerVar.equalsIgnoreCase("exit"))
            {
                return;
            } else
            {
                System.out.println("Invalid Input");
                waitInSeconds(3);
                clearTypingSpace();
                problemTwo();
            }
        } else
        {
            waitInSeconds(2);
            System.out.println("We are now Sold out. Here is a list of Tickets:");
            waitInSeconds(2);
            for (int index = 0; index < ticketArrayList.size(); index++)
            {
                System.out.println(ticketArrayList.get(index) + "\n");
            }
            waitInSeconds(2);
            System.out.println("SOLD OUT");
            waitInSeconds(2);
            System.out.println("SOLD OUT");
            waitInSeconds(2);
            System.out.println("SOLD OUT");
            waitInSeconds(2);
            System.out.println("SOLD OUT");
            waitInSeconds(2);
            System.out.println("SOLD OUT");
            waitInSeconds(10);
            return;
        }
        waitInSeconds(3);
        clearTypingSpace();
        problemTwo();
    }

}
