package ru.job4j.map;

import java.util.*;

public class ComputeIfAbsent {

    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
       int count = 1;

       for (Integer k : names.keySet()) {
           names.computeIfPresent(k, (key, value) -> String.valueOf(users.get(k - 1)));
       }

       for (User u : users) {
           names.computeIfAbsent(u.getId(), key -> u.getName());
       }

        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
                return name;
        }

    }

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "", 2, ""));
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name3"),
                new User(4, "name4")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        System.out.println(rsl);

    }
}
