package com.edu.collecttionstest;

import com.edu.collections.Shipment;
import org.testng.annotations.Test;

import static com.edu.collections.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;


public class ShipmentTest  {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() {
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment,contains(door, window));
    }

    @Test
    public void shouldReplaceItems() {

        shipment.add(door);
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(floorPanel, window));
    }

    @Test
    public void shouldNotReplaceMissingItems() {
        shipment.add(window);
        shipment.replace(door, floorPanel);
        assertThat(shipment, contains(window));

    }

    @Test
    public void shouldIdentifyVanRequirements() {
        shipment.add(window);
        shipment.add(door);
        shipment.add(floorPanel);
        shipment.prepare();
        assertThat(shipment.getLightVanProducts(), contains(window));
        assertThat(shipment.getHeavyVanProducts(), contains(door));
    }
}
