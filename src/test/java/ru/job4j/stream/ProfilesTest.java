package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProfilesTest {

    @Test
    public void whenCollectSuccessful() {
        Profiles p = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("New York", "19-th", 14, 73)),
                new Profile(new Address("London", "Piccadilly", 4, 2)),
                new Profile(new Address("Paris", "Rue de Rivoli", 4, 3)),
                new Profile(new Address("New York", "19-th", 14, 73))
        );
        List<Address> expected = List.of(
                new Address("London", "Piccadilly", 4, 2),
                new Address("New York", "19-th", 14, 73),
                new Address("Paris", "Rue de Rivoli", 4, 3)
        );
         List<Address> rsl = p.collect(profile);
         Assert.assertEquals(expected, rsl);
    }

}