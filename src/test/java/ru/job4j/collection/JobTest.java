package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class JobTest {
    @Test
    public void whenComparatorDeskByName() {
        int rsl = new JobDescByName().compare(
                new Job("Start task", 1),
                new Job("End task", 2));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDeskByPriority() {
        int rsl = new JobDescByPriority().compare(
                new Job("Start task", 1),
                new Job("End task", 2));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByName() {
        int rsl = new JobAscByName().compare(
                new Job("Start task", 1),
                new Job("End task", 2));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscByPriority() {
        int rsl = new JobAscByPriority().compare(
                new Job("Start task", 1),
                new Job("End task", 2));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Start task", 2),
                new Job("Start task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}