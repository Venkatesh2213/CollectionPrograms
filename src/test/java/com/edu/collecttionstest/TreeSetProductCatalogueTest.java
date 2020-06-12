package com.edu.collecttionstest;


import com.edu.collections.TreeSetProductCatalogue;
import org.testng.annotations.Test;

import static com.edu.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TreeSetProductCatalogueTest {

    TreeSetProductCatalogue catalogue;

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        catalogue = new TreeSetProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);
        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }

}
