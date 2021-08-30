package ru.job4j.stream;

import java.util.Objects;

public class Student1 {

    private final String surName;
    private final int score;

    public Student1(String surName, int score) {
        this.surName = surName;
        this.score = score;
    }

    public String getSurName() {
        return surName;
    }

    public int  getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)  {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student1 student1 = (Student1) o;
        return score == student1.score && surName.equals(student1.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, score);
    }

    @Override
    public String toString() {
        return "Student1{"
              +  "surName='" + surName + '\''
              +  ", score=" + score
              +  '}';
    }
}