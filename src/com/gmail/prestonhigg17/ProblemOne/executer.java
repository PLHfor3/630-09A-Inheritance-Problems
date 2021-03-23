package com.gmail.prestonhigg17.ProblemOne;

import com.gmail.prestonhigg17.Algorithms.SortByName;
import com.gmail.prestonhigg17.ProblemOne.API.Child;
import com.gmail.prestonhigg17.ProblemOne.API.Guardian;
import com.gmail.prestonhigg17.ProblemOne.API.Person;

import java.util.ArrayList;

public class executer
{
    public static void problemOne()
    {
        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Child());
        person.add(new Child());
        person.add(new Guardian());
        person.add(new Person());
        person.get(0).setFirstName("Preston");
        person.get(0).setLastName("Digg");
        person.get(0).setFather("Devon");
        person.get(0).setMother("Laura");
        person.get(1).setFirstName("Preston");
        person.get(1).setLastName("HDigg");
        person.get(1).setFather("Devon");
        person.get(1).setMother("Laura");
        ((Child) person.get(0)).setAge(16);
        ((Child) person.get(0)).setHeight(74);
        ((Child) person.get(0)).setWeight(177.4);
        person.get(2).setFirstName("Devon");
        person.get(2).setLastName("Bigg");
        ((Guardian) person.get(2)).setPhoneNumber("402-280-jays");
        ((Guardian) person.get(2)).setRelationshipToChild("Father");
        ((Child) person.get(0)).setAge(1);
        System.out.println((person.get(0)).toString());
        System.out.println((person.get(2)).toString());
        person.get(3).setLastName("Aigg");
        person.get(3).setFirstName("Laura");
        person.get(3).setMother("Billie");
        person.get(3).setFather("Francis");
        System.out.println(person.get(3).toString());
        SortByName listSorter = new SortByName();
        ArrayList<Person> sortedArray = new ArrayList<Person>();
        System.out.println("Last name in the \"2\" ArrayList slot before sort: " + person.get(2).getLastName());
        sortedArray = listSorter.sortByName(person);
        System.out.println("Last name in the \"2\" ArrayList slot after sort: " + sortedArray.get(2).getLastName());
    }
}
