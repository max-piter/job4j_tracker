package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    /**
     *
     * @param students метод  принимает в параметры список студентов
     * @param bound ограничение по оценкам
     * @return  возвращает отфильтрованный список без  нулевыз  значений
     *
     * null убираем с помощью метода ofNullable, он фильтрует  поток с null элементами
     */
    public static List<Student1> levelOf(List<Student1> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}
