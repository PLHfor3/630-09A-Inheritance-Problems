package com.gmail.prestonhigg17.Algorithms;

public class MyStringBuilderMethods
{
    public String arrayToString(String[] convertString)
    {
        String returningString = convertString[0];
        for (int index = 1; index < convertString.length; index++)
        {
            returningString = returningString + " - " + convertString[index];
        }
        return returningString;
    }

    public boolean doesArrayContainValue(String[] values, String testValue)
    {
        for (int index = 0; index < values.length; index++)
        {
            if (values[index].equalsIgnoreCase(testValue))
            {
                return true;
            }
        }
        return false;
    }

    public int whatIsTheIndexOfName(String[] values, String testValue)
    {
        int index;
        for (index = 0; index < values.length; index++)
        {
            if (values[index].equalsIgnoreCase(testValue))
            {
                return index;
            }
        }
        return index;
    }

    public String doubleArrayToString(double[] convertString, String label, boolean labelBeforeOrAfter) // boolean decides if label is before or after value
    {
        String returningString;

        if (labelBeforeOrAfter)
        {
            returningString = label + Double.toString(convertString[0]);
        } else
        {
            returningString = Double.toString(convertString[0]) + label;
        }


        for (int index = 1; index < convertString.length; index++)
        {
            if (labelBeforeOrAfter)
            {
                returningString = returningString + " - " + label + Double.toString(convertString[index]);
            } else
            {
                returningString = returningString + " - " + Double.toString(convertString[index]) + label;
            }

        }
        return returningString;
    }
}
