package ru.job4j.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFilter {

    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
       return  findByPassport(workers, passport).get().getChildren().stream()
               .filter(child -> child.getAge() < 15)
               .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

    public static void main(String[] args) {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 18);
        Child c3 = new Child("c1", 11);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2));
        Worker worker2 = new Worker("456", List.of(c3, c4));
      List<Child> list1 =  OptionalFilter.defineChildren(List.of(worker1, worker2), "123");
      List<Child> list2 =  OptionalFilter.defineChildren(List.of(worker1, worker2), "456");
        System.out.println(list1);
        System.out.println(list2);
    }

}
