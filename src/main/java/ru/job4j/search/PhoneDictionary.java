package ru.job4j.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        Predicate<Person> compareName =  p -> p.getName().contains(key);
        Predicate<Person> compareSurname =  p -> p.getSurname().contains(key);
        Predicate<Person> comparePhone =  p -> p.getPhone().contains(key);
        Predicate<Person> compareAdress =  p -> p.getAddress().contains(key);
        var combine = compareName.or(compareSurname)
                .or(comparePhone).or(compareAdress);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
