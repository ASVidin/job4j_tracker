package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), Is.is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenOrderDuplicated() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("3sfe", "Suit"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.size(), Is.is(1));
    }
}