package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * этот класс является главным сервисом нашей банковской системы,
 * здесь осуществляются все простейшие операции со счетами клиентов
 * @author Unknown
 * @version 1.0
 */
public class BankService {

    /**
     * все данные о клиентах и счетах  хранятся в коллекции типа HashMap
     * клиены - привязанные к ним счета
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод  добавляет в систему нового клиента
     * После получения  списков всех счетов пользователя, добавляем к ним новый счет.
     * В этом методе осуществляется проверка, что такого счета у пользователя еще нет.
     * @param user непосредственно клиент, с пустым пока списком счетов.
     *
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * метод привязывает счет к клиенту
     * клиента подтягиваем из  системы по номеру паспорта
     * @param passport уникальный номер паспорта клиента,
     *                по которому мы определим самого клиента
     * @param account счёт, который нужно привязать к клиенту,
     *                добавить в список счетов, если у клиента счёт не один.
     */
    public void addAccount(String passport, Account account) {
     User user = findByPassport(passport);
     if (user != null) {
         List<Account> accounts = users.get(user);
         if (!accounts.contains(account)) {
             accounts.add(account);
         }
     }
    }

    /**
     * метод поиска клиента по паспорту
     * используется  перебор всех элементов
     * через цикл for-earch и метод Map.keySet
     * @param passport номер паспорта
     * @return возвращает имя клиента
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(st -> st.getPassport().equals(passport))
                .findFirst()
                .orElse(null);

    }

    /**
     * Метод  осуществляет поиск счёта по реквизитам
     * @param passport чтобы найти клиента
     * @param requisite чтобы найти нужный счёт
     * @return возвращает счёт по реквизитам
     */
    public Account findByRequisite(String passport, String requisite) {
        User user  = findByPassport(passport);
        if (user != null) {
             return  users.get(user)
                     .stream()
                     .filter(u -> u.getRequisite().equals(requisite))
                     .findFirst()
                     .orElse(null);

        }
        return null;
    }

    /**
     * простейшая операция перевода денег со счёта на счёт
     * по номеру паспорта и реквизитам
     * @param srcPassport паспорт, чьи деньги
     * @param srcRequisite счёт, откуда снимать
     * @param destPassport паспорт, куда деньги
     * @param destRequisite счёт, куда переводить
     * @param amount сумма переода
     * @return результат зависит от суммы на счету, чтобы сумма перевода
     * её не превышала. Так же проверяем счета клиентов на валидность, так как
     * ищем их  по входящим параметрам
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcUser = findByRequisite(srcPassport, srcRequisite);
        Account destUser = findByRequisite(destPassport, destRequisite);
        if (srcUser != null && srcUser.getBalance() >= amount && destUser != null) {
            srcUser.setBalance(srcUser.getBalance() - amount);
            destUser.setBalance(destUser.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * точка входа, метод, с которого начинается выполнение программы
     * @param args
     */
    public static void main(String[] args) {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        User user1 = bank.findByPassport("3434");
        System.out.println(user1);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        System.out.println(bank.findByRequisite("3434", "5546").getBalance());
    }
}
