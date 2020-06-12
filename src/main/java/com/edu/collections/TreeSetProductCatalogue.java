package com.edu.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static com.edu.collections.Product.BY_NAME;

public class TreeSetProductCatalogue implements  Iterable<Product>{


    private final Set<Product> productsSet = new TreeSet<> (BY_NAME);

    public void isSuppliedBy(Supplier supplier) {
        productsSet.addAll(supplier.getProducts());
    }
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Product> iterator() {
        return null;
    }
}
