package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobDescByNameTest {

    @Test
    public void testDescByNameCompare() {
        Comparator<Job> descName = new JobDescByName();
        int rsl = descName.compare(
                new Job("Max", 1),
                new Job("Norm", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}