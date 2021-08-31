package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
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
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(st -> st.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод  осуществляет поиск счёта по реквизитам
     * @param passport чтобы найти клиента
     * @param requisite чтобы найти нужный счёт
     * @return возвращает счёт по реквизитам
     */
    public  Optional<Account> findByRequisite(String passport, String requisite) {
         Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            Optional<Account> rsl =  users.get(user.get())
                     .stream()
                     .filter(u -> u.getRequisite().equals(requisite))
                     .findFirst();
            if (rsl.isPresent()) {
                return rsl;
            }
        }

        return Optional.empty();

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
        Optional<Account> srcUser = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destUser = findByRequisite(destPassport, destRequisite);
        if (srcUser.isPresent() && destUser.isPresent() && srcUser.get().getBalance() >= amount) {
            srcUser.get().setBalance(srcUser.get().getBalance() - amount);
            destUser.get().setBalance(destUser.get().getBalance() + amount);
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
        Optional<User> user1 = bank.findByPassport("3434");
        System.out.println(user1);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        System.out.println(bank.findByRequisite("3434", "5546").get().getBalance());
    }
}
