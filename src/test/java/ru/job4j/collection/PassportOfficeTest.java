package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), Is.is(citizen));
    }

    @Test
    public void addDuplicatedCitizen() {
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Ivan Ivanov");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        assertFalse(office.add(citizen2));
    }
}