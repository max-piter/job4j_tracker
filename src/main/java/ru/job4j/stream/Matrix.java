package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8)
        );
        
      List<Integer> newList = matrix.stream().flatMap(List :: stream).collect(Collectors.toList());
    }
}
