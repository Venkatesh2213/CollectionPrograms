package com.edu.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonFilter {
    /**
     * Method to Sort The list in a Descending Order.
     *
     * @param list of people
     * @return sorted List
     */
    public static List<Person> sortDesc(List<Person> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        list.sort(Comparator.comparing(Person::getAge).reversed());
        return list;
    }

    /**
     * Method to Sort The list in a Ascending Order.
     *
     * @param list of people
     * @return sorted List
     */
    public static List<Person> sortAsce(List<Person> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        list.sort(Comparator.comparing(Person::getAge));
        return list;
    }

    /**
     * Method to filter people with age.
     *
     * @param list     of people
     * @param agelimit to filter
     * @return list with lessthan given age
     */
    public static List<Person> removeif(List<Person> list, int agelimit) {
        if (list.isEmpty() || agelimit <= 0) {
            return Collections.emptyList();
        }
        list.removeIf(person -> person.getAge() > agelimit);
        return list;
    }

}
