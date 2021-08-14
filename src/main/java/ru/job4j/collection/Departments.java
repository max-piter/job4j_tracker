package ru.job4j.collection;

import java.util.*;

/**
 *Class Departments - создает список всех подразделений + производит сортировку кодов подразделений.
 * @author Max Korovkin (butcher_1996@mail.ru)
 * @version 1.0
 * @since  15.08.2021 (ровно 31 год со дня смерти Виктора Цоя)
 */

public class Departments {

    /**
     * метод fillGaps
     * @param deps массив представляет коды произведений ввиде строк
     * @return возвращает отсортированный список, с добавлением отсутствующих  подразделений
     */

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * метод осуществляет сортировку по возрастанию
     * @param orgs принимает в качестве аргумента список подразделений
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    /**
     * метод осуществляет сортировку по убыванию  за счёт переопределённого
     * компаратора в классе {@link DepDescComp}
     * @param orgs принимает список подразделений
     */
    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}