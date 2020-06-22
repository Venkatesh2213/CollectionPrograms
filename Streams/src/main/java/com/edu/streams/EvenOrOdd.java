package com.edu.streams;

import java.util.function.Predicate;

public class EvenOrOdd {
    public Predicate<Integer> predicate;

    public void validation() {
         predicate = i -> i % 2 == 0 ;
         predicate = i -> i % 2 == 1 ;

    }
    /*public static void main(String[] args) {
        EvenOrOdd.methodOr(5);
    }
    public static boolean methodOr(Integer input) {
        Predicate<Integer> predicate = i -> i % 2 ==0;
        Predicate<Integer> predicate1 = i -> i % 2 ==1;
       System.out.println(predicate.test(4));
        System.out.println(predicate1.test(5));
        Predicate<Integer> predicate2 = predicate.or(predicate1);
        return predicate.test(input);
    }*/
}

