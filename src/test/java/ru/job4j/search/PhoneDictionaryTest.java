package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var test = new PhoneDictionary();
        test.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        test.add(
                new Person("Petr", "Korov", "543", "SPb")
        );
        test.add(
                new Person("Max", "Black", "345", "Moscow")
        );
        test.add(
                new Person("Max", "Petr", "345", "Moscow")
        );
        var persons = test.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getSurname(), is("Korov"));
        assertThat(persons.get(2).getSurname(), is("Petr"));

    }

    @Test
    public void whenFindNoName() {
        var test = new PhoneDictionary();
        test.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        test.add(
                new Person("Max", "Petr", "345", "Moscow")
        );
       var persons = test.find("Pier");
        assertThat(persons.size(), is(0));
    }

    @Test
    public void whenFindByName1() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}