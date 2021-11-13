package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4, 23),
                new Job("Impl task", 2, 14),
                new Job("Reboot server", 1, 11)

        );
       System.out.println(jobs);
        Collections.sort(jobs);
      System.out.println(jobs);

    }
}
