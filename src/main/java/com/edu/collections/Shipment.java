package com.edu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<com.edu.collections.Product> {
    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int PRODUCT_NOT_PRESENR = -1;
    /* @Override
     public Iterator<Product> iterator() {
         return null;
     }*/
    public final List<Product> products = new ArrayList<>();
    private List<Product> heavyVanProducts;
    private List<Product> lightVanProducts;

    public void add(Product product) {
        products.add(product);
    }

    /**
     * Method to replace products.
     *
     * @param oldProduct will be replaced by new product
     * @param newProduct will replace oldproduct
     */

    public void replace(Product oldProduct, Product newProduct) {
        final int index = products.indexOf(oldProduct);
        if (index != PRODUCT_NOT_PRESENR) {
            products.set(index, newProduct);
        }
    }

    /**
     * Method to Prepare Products as per weight.
     */
    public void prepare() {
        //sot our list of products by weight
        //find the product index that needds  the heavy van
        //assign views of the product list for heavy and light vans
        // products.sort(Product.BY_WEIGHT);
        int splitPoint = findSplitPoint();
        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());

    }

    private int findSplitPoint() {
        for (int i = 0; i < products.size(); i++) {
            final Product product = products.get(i);
            if (product.getWeight() > LIGHT_VAN_MAX_WEIGHT) {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts() {
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts() {
        return lightVanProducts;
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
