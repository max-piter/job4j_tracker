package ru.job4j.map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl  = Optional.empty();
        for (var s: students.keySet()) {
            if (account.equals(s.getAccount())) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> s = findByAccount(account);

        if (s.isPresent()) {
                for (var subj : students.get(s.get())) {
                    if (name.equals(subj.getName())) {
                        rsl = Optional.of(subj);
                        break;
                    }
                }
           }
        return rsl;
    }

}
