package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return   students.stream()
             .filter(predict)
             .collect(Collectors.toList());
    }

    public  Map<String, Student> collectToMap(List<Student> list) {

       return list.stream()
               .collect(
               Collectors.toMap(
                       Student :: getSurName,
                       student -> student,
                       (oldKey, newKey) -> newKey
               ));
    }
}
