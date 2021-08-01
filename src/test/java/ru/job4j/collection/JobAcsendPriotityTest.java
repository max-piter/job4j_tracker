package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobAcsendPriotityTest {

    @Test
    public void testJobAcsendPriotityCompare() {
        Comparator<Job> acsendPriotity = new JobAcsendPriotity();
        int rsl = acsendPriotity.compare(
                new Job("Max", 1),
                new Job("Norm", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}