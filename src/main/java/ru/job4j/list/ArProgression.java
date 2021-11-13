package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = 0;
        boolean ifArProgr = true;

        for (int i = 1; i < data.size() - 1; i++) {
            if ((data.get(i - 1) + data.get(i + 1)) / 2 != data.get(i)) {
               ifArProgr = false;
               break;
            }
        }
        if (ifArProgr) {
            for (int i = 0; i < data.size(); i++) {
                rsl += data.get(i);
            }
        }
            return rsl;

    }

        public static void main(String[] args) {
            List<Integer> data = List.of(
                    1, 6, 11, 16, 21,
                    26, 31, 36, 41, 46
            );
            int rsl = ArProgression.checkData(data);
            System.out.println(rsl);

            List<Integer> data1 = List.of(
                    1, 6, 11, 12, 21,
                    26, 31, 36, 41, 46
            );
            int rsl1 = ArProgression.checkData(data1);
            System.out.println(rsl1);
        }

}
