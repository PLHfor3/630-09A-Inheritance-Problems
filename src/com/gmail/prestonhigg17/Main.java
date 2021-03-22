package com.gmail.prestonhigg17;

import com.gmail.prestonhigg17.API.Child;
import com.gmail.prestonhigg17.API.Guardian;
import com.gmail.prestonhigg17.API.Person;
import com.gmail.prestonhigg17.Problems.SortByName;

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
        person.get(0).setLastName("Higg");
        person.get(0).setFather("Devon");
        person.get(0).setMother("Laura");
        ((Child) person.get(0)).setAge(16);
        ((Child) person.get(0)).setHeight(74);
        ((Child) person.get(0)).setWeight(177.4);
        person.get(2).setFirstName("Devon");
        person.get(2).setLastName("Higg");
        ((Guardian) person.get(2)).setPhoneNumber("402-280-jays");
        ((Guardian) person.get(2)).setRelationshipToChild("Father");
        ((Child) person.get(0)).setAge(1);
        System.out.println((person.get(0)).toString());
        System.out.println((person.get(2)).toString());
        person.get(3).setLastName("Higg");
        person.get(3).setFirstName("Laura");
        person.get(3).setMother("Billie");
        person.get(3).setFather("Francis");
        System.out.println(person.get(3).toString());
        SortByName listSorter = new SortByName();
    }
}
