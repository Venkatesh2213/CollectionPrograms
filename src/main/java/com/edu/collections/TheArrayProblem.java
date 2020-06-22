package com.edu.collections;

import java.util.Arrays;

public class TheArrayProblem {

    Product door = new Product("Wooden Door", 35);
    Product window = new Product("Floor Panel", 22);
    public Product[] products = {door, window};

    //protected List<Product> list = Arrays.asList(products);

    public static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        //System.out.println(length +" "+newArray.length);
        return newArray;
    }
}
