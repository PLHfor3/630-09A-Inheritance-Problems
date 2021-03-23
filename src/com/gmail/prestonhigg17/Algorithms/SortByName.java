package com.gmail.prestonhigg17.Algorithms;

import com.gmail.prestonhigg17.API.Person;

import java.util.ArrayList;

public class SortByName
{

    public ArrayList<Person> sortByName(ArrayList<Person> list)
    {
        Person temp;
        Person[] str = new Person[list.size()];
        for (int index = 0; index < list.size(); index++)
        {
            str[index] = list.get(index);
        }

        int count = list.size();

        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++)
            {
                if ((str[i].getLastName()).compareTo((str[j]).getLastName()) > 0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        for (int index = 0; index < str.length; index++)
        {
            list.set(index, str[index]);
        }
        
        return list;
    }
}
