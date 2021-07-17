package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Max");
        student.setSurname("Korovkin");
        student.setPatronimic("Vladimirovich");
        student.setGroup(6);
        student.setDateOfEnty(2021);
        System.out.println("Name: " + student.getName() + System.lineSeparator()
                + "Surname: " + student.getSurname() + System.lineSeparator()
                + "Patronimic: " + student.getPatronimic() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "Entrance: " + student.getDateOfEnty());
    }
}
