package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingDouble {
    public static class Company {

        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {

        private int age;

        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                m -> m.getCompany().getName(),
                Collectors.averagingDouble(w -> w.getAge())
        ));
    }

    /**
     *
     * собирает в заданную  коллекцию, но по выбранному вами принципу
     */
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toCollection(LinkedHashSet:: new));
    }

    public static Map<Integer, Integer> collect1(Stream<Integer> data) {
        return data.collect(Collectors
                .toMap(k -> k, v -> v, (oldV, newV) -> oldV, LinkedHashMap:: new));
    }

    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining());

    }

    public static void main(String[] args) {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Microsoft");
        Worker w1 = new Worker(20, c1);
        Worker w2 = new Worker(25, c2);
        Worker w3 = new Worker(30, c2);
        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);
        Worker w6 = new Worker(45, c3);

        Map<String, Double> expect = AveragingDouble.averaging(List.of(w1, w2, w3, w4, w5, w6));
        System.out.println(expect);
    }

}
