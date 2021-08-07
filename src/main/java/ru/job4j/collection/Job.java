package ru.job4j.collection;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;
    private  int date;

    public Job(String name, int priority, int date) {
        this.name = name;
        this.priority = priority;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Job{"
               + "name='" + name + '\''
                + ", priority=" + priority
               +  '}';
    }

    @Override
    public int compareTo(Job another) {
        return this.priority - another.priority;
    }
}
