package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

public class JobDescByPriorityTest {

    @Test
    public void testDescByPriorityCompare() {
        Comparator<Job> descPrior = new JobDescByPriority();
        int rsl = descPrior.compare(
                new Job("Max", 1),
                new Job("Norm", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}