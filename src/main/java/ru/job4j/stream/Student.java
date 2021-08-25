package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private final int score;
    private final String surName;

    public Student(int score, String surName) {
        this.score = score;
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public int  getScore() {
       return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score && surName.equals(student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surName);
    }
}
