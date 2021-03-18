package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.API.Child;
import com.gmail.prestonhigg17.API.Guardian;
import com.gmail.prestonhigg17.API.Person;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Child());
        person.add(new Child());
        person.add(new Guardian());
        person.add(new Person());
        person.get(0).setFirstName("Preston");
        

    }
}
