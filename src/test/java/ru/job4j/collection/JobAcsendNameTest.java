package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobAcsendNameTest {

    @Test
    public void testJobAcsendByNameCompare() {
        Comparator<Job> acsendName = new JobAcsendName();
        int rsl = acsendName.compare(
                new Job("Max", 1, 1),
                new Job("Norm", 2, 2)
        );
        assertThat(rsl, lessThan(0));
    }
}