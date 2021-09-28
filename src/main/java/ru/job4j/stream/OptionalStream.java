package ru.job4j.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalStream {
    public static class PhoneNumber {

        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }

    }

    public static class User {

        private int id;

        private List<PhoneNumber> numbers;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public int getId() {
            return id;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst().stream()
                .flatMap(user -> user.getNumbers().stream())
                .filter(number -> number.getPhone().startsWith(region))
                .collect(Collectors.toList());
    }

    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(str -> str.endsWith(".java"))
                .findFirst()
                .flatMap(str -> Optional.of(str.length()));
    }

    public static void main(String[] args) {
        Optional<Integer> opt =  OptionalStream.flatMap(
                List.of("Hello.java", "Hello.js", "Hello.py")
        );

        System.out.println(opt);

    }
}
