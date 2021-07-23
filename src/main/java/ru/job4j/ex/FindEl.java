package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            } else if (rsl == -1) {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] num = new String[]{"1", "2", "3", "4", "5"};
        String key = "4";
        try {
            FindEl.indexOf(num, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
