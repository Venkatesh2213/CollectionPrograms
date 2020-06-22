package com.edu.streams;

import java.util.function.Predicate;

public class PredicateClass {
    /**
     * Method to check the length of given input either lessthan given range or not.
     *
     * @param input to check length lessthan given range
     * @return true if input length is lessthan range otherwise false
     */
    public static boolean lengthOf(String input, int range) {
        Predicate<String> length = s -> s.length() < range;
        return length.test(input);
    }

    /**
     * Implimenting && (AND) to check result.
     *
     * @param input to check length
     * @return true if length match
     */
    public static boolean methodAnd(String input) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 10;
        System.out.println(p1.test("Whitebox"));
        System.out.println(p2.test("Learning"));
        Predicate<String> p3 = p1.and(p2);
        return p3.test(input);
    }

    /**
     * Implimenting || (OR) to check result.
     *
     * @param input to check length
     * @return true if length matche
     */
    public static boolean methodOr(String input) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() < 25;
        System.out.println(p1.test("Whitebox"));
        System.out.println(p2.test("Learning"));
        Predicate<String> p3 = p1.or(p2);
        return p3.test(input);
    }

    /**
     * Method to check Length of given strings.
     *
     * @param input to check two strings are equal
     * @return true if both equal are equal
     */
    public static boolean methodEqual(String input, String input2) {
        Predicate<String> equal = Predicate.isEqual(input2);
        return equal.test(input);

    }
}



