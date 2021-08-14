package ru.job4j.collection;

import java.util.Comparator;

/**
 *  Class DepDescComp - реализует компаратор для сортировки  подразделений по убыванию.
 * @author Max Korovkin (butcher_1996@mail.ru)
 * @version 1.0
 * @since  15.08.2021 (ровно 31 год со дня смерти Виктора Цоя)
 *
 */
public class DepDescComp implements Comparator<String> {

    /**
     * переопределение абстрактного метода compare интерфейса Comparator для
     * организации необходимой сортировки.
     *
     * метод  реализует сортировку элементов по убыванию
     * @param o1 код подразделения
     * @param o2 код  подразделения
     *            при помощи метода split("/") делим входящие  строки на элементы и сравниваем
     *             первые индексы, чтобы понимать, как вести сравнивать дальше.
     *             подразделения -  по убыванию, но!
     *             Если они в одном подразделении
     *           - сравниваем по возрастанию.
     * @return возвращает результат сравнения int = -1, 0 или 1
     */
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        int rsl = s2[0].compareTo(s1[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}
