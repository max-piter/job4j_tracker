package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
       System.out.println(jobs);
        Collections.sort(jobs);
       System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);

        Comparator<Job> comb = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, comb);
        Comparator<Job> combAsc = new JobAcsendName()
                .thenComparing(new JobAcsendPriotity());
        Collections.sort(jobs, combAsc);
    }
}
