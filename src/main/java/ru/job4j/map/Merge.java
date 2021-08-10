package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User el : users) {
            names.putIfAbsent(el.id, el.name);
        }
        for (User el : users) {
            names.merge(el.id, el.surname, (oldV, newV) -> oldV + " " + newV);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return id + " " + name + " " + surname;
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bill");
        map.merge(1, "Clinton", (oldV, newV) -> oldV + " " + newV);
        System.out.println(map.get(1));
        map.merge(2, "Trump", (oldV, newV) -> oldV + " " + newV);
        System.out.println(map.get(2));
        Map<Integer, String> names = new HashMap<>(Map.of(1, "name1", 2, "name2"));
        List<User> users = List.of(
                new User(1, "name1", "surname1"),
                new User(2, "name2", "surname2"),
                new User(3, "name3", "surname3"),
                new User(4, "name4", "surname4")
        );
        Map<Integer, String> rsl = Merge.collectData(names, users);
        System.out.println(rsl);
    }
}
