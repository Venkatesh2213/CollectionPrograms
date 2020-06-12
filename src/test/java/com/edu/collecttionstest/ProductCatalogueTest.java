package com.edu.collecttionstest;

import com.edu.collections.ProductCatalogue;
import org.testng.annotations.Test;

import static com.edu.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;




public class ProductCatalogueTest {
    ProductCatalogue catalogue;

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }
}