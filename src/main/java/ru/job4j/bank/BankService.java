package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
     User user = findByPassport(passport);
     if (user != null) {
         List<Account> accounts = users.get(user);
         if (!accounts.contains(account)) {
             accounts.add(account);
         }
     }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user  = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

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
