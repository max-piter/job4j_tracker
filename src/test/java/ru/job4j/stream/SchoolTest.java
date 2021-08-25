package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(40, "Surname4"),
                new Student(50, "Surname5"),
                new Student(70, "Surname7"),
                new Student(90, "Surname9")
        );
        School sc = new School();
        Predicate<Student> classA = student -> student.getScore() >= 70;
        List<Student> rsl = sc.collect(students, classA);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname7"));
        expected.add(new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname5"),
                new Student(60, "Surname6"),
                new Student(80, "Surname8")
        );
        School sc = new School();
        Predicate<Student> classB = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> rsl = sc.collect(students, classB);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname6"),
                new Student(90, "Surname9")
        );
        School sc = new School();
        Predicate<Student> classV = student -> student.getScore() > 0 && student.getScore() < 50;
        List<Student> rsl = sc.collect(students, classV);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenListToMap() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname2")
        );
        School school = new School();
        Map<String, Student> expected =  Map.of(
                "Surname1", new Student(10, "Surname1"),
                "Surname3", new Student(30, "Surname3"),
                "Surname4", new Student(40, "Surname4"),
                "Surname2", new Student(60, "Surname2")
        );
        Map<String, Student> rsl = school.collectToMap(students);
        assertEquals(rsl, expected);
    }

    @Test
    public void whenListToMapWithDupl() {
        List<Student> students = List.of(
                new Student(10, "Surname1"),
                new Student(10, "Surname1"),
                new Student(30, "Surname3"),
                new Student(40, "Surname4"),
                new Student(60, "Surname2")
        );
        School school = new School();
        Map<String, Student> expected =  Map.of(
                "Surname1", new Student(10, "Surname1"),
                "Surname3", new Student(30, "Surname3"),
                "Surname4", new Student(40, "Surname4"),
                "Surname2", new Student(60, "Surname2")
        );
        Map<String, Student> rsl = school.collectToMap(students);
        assertEquals(rsl, expected);
    }
}