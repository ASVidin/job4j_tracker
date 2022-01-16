package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemAscByNameTest {

    @Test
    public void whenAscCompare() {
        Item item1 = new Item("One");
        Item item2 = new Item("Two");
        Item item3 = new Item("Three");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Collections.sort(items, new ItemAscByName());
        List<Item> expect = new ArrayList<>();
        expect.add(item1);
        expect.add(item3);
        expect.add(item2);
        assertThat(items, is(expect));
    }
}