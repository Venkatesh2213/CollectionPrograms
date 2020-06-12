package com.edu.collecttionstest;

import com.edu.collections.SortedProductCatalogue;
import org.testng.annotations.Test;

import static com.edu.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 *
 */
public class SortedProductCatalogueTest {
    SortedProductCatalogue catalogue;
    @Test
    public void shouldFindLightVanProducts() {
        catalogue = new SortedProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFindHeavyVanProducts() {
        catalogue = new SortedProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
    }

}
