package com.edu.collecttionstest;

import com.edu.collections.TheArrayProblem;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;



public class ProductTest {
    public List listOfProducts;
    public static TheArrayProblem theArrayProblem;

    /**
     * Setup Method.
     */

    @BeforeTest
    public void setUp() {
        theArrayProblem = new TheArrayProblem();
        //string = Arrays.toString(theArrayProblem.products);
        listOfProducts = Arrays.asList(theArrayProblem.products);
        System.out.println(listOfProducts);
        System.out.println(listOfProducts.get(0));
        System.out.println(listOfProducts.get(1));
        //char[] listOfProducts1 = listOfProducts.toCharArray();*/
    }

    @Test
    public void sizeOfList() {
        assertEquals(2, listOfProducts.size());
    }
}









