package ru.job4j.stream;

public class Worker {

    private String name;
    private String surname;
    private byte  age;
    private String address;
    private byte experience;
    private String specialSkills;

    @Override
    public String toString() {

        return "Worker{"
                +    "name='" + name + '\''
                +    ", surname='" + surname + '\''
                +    ", age=" + age
                +    ", address='" + address + '\''
                +    ", experience=" + experience
                +    ", specialSkills='" + specialSkills + '\''
                +    '}';
    }

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String address;
        private byte experience;
        private String specialSkills;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        Builder buildExperience(byte experience) {
            this.experience = experience;
            return this;
        }

        Builder buildSpecialSkills(String specialSkills) {
            this.specialSkills = specialSkills;
            return this;
        }

        Worker build() {
            Worker worker = new Worker();
            worker.name = name;
            worker.surname = surname;
            worker.age = age;
            worker.address = address;
            worker.experience = experience;
            worker.specialSkills = specialSkills;
            return worker;
        }

    }

        public static void main(String[] args) {
            Worker worker = new Builder().buildName("Max")
                    .buildSurname("Korov")
                    .buildAge((byte) 45)
                    .buildAddress("Sant-Peters")
                    .buildExperience((byte) 12)
                    .buildSpecialSkills("butcher")
                    .build();
            System.out.println(worker);

        }

}
