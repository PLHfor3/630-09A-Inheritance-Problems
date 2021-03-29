package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.ProblemOne.Executer;
import com.gmail.prestonhigg17.ProblemThree.API.CandyMachine;
import com.gmail.prestonhigg17.ProblemThree.SnackBar;

public class Main
{
    public static void main(String[] args)
    {
        Executer.problemOne();
        SnackBar.run();
        CandyMachine candyMachine = new CandyMachine();
        candyMachine.printTest();
    }
}
