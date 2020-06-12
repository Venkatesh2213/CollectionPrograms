package com.edu.collections;

public class ProductFixtures {
    public static final Product door = new Product("Wooden Door", 35);
    public static final Product floorPanel = new Product("Floor Panel", 25);
    public static final Product window = new Product("Glass Window", 10);
    public static final Supplier bobs = new Supplier("Bob's Household Supplies");
    public static final Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.getProducts().add(door);
        bobs.getProducts().add(floorPanel);
        bobs.getProducts().add(window);
        kates.getProducts().add(door);
        kates.getProducts().add(new Product("Floor Panel",25));
        kates.getProducts().add(window);
    }
}



