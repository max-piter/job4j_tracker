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
                new Profile(new Address("New York", "17-th", 12, 23)),
                new Profile(new Address("Paris", "Rue de Rivoli", 4, 3))
        );
        List<Address> expected = List.of(
                new Address("New York", "17-th", 12, 23),
                new Address("Paris", "Rue de Rivoli", 4, 3)
        );
         List<Address> rsl = p.collect(profile);
         Assert.assertEquals(expected, rsl);
    }

}