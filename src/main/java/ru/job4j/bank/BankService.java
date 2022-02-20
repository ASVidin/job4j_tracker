package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель банковской системы, с помощью которой можно регистрировать пользователя,
 * удалять пользователя из системы, добавлять пользователю банковский счет (У пользователя системы могут быть несколько счетов),
 * Переводить деньги с одного банковского счета на другой счет.
 *
 * @author Andrey Vidin
 * @version 1.0
 */
public class BankService {
    /**
     * Поле типа Map содержит всех пользователей системы с привязанными к ним счетами.
     * Счета хранятся в коллекции типа List
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает пользователя и добавляет его систему.
     * Если такого пользователя еще нет в системе, то он добавляется с пустым списком счетов. Иначе - не добавляется.
     *
     * @param user пользователь, который добавляется в очередь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет пользователю. Пользователь определяется по паспортным данным.
     * Перед добавлением счета производится проверка, что такого счета у пользователя нет.
     *
     * @param passport данные паспорта пользователя
     * @param account  номер нового добавляемого пользователю счета
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
     * Метод ищет пользователя по номеру паспорта.
     * Если пользователь не найден метод возвращает null.
     *
     * @param passport данные паспорта пользователя
     * @return возвращает пользователя или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет банковский счет по паспортным данным пользователя и переданным реквизитам счета.
     * Сначала при помощи метода findByPassport ищется пользователь.
     * Если пользователь найден в списке его счетов ищутся переданные реквизиты.
     * Если соответствующий реквизитам счет найдет, он возвращается.
     * Если пользователь или переданные реквизиты не найдены возвращается null.
     *
     * @param passport  паспортные данные пользователя
     * @param requisite реквизиты искомого счета пользователя
     * @return возвращает счет пользователя или null, если пользователь не найден
     * или переданные реквизиты не соответствуют ни одному из счетов пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счета на другой.
     * С помощью метода findByRequisite происходит поиск каждого из счетов по реквизитам.
     * Если оба счета найдены и денег на исходном счете достаточно, то происходит списание денег
     * на счёте srcAccount (с которого переводят), а начисление на счет destPassport (на который переводят).
     *
     * @param srcPassport   данные паспорта пользователя, от которого переводятся деньги
     * @param srcRequisite  реквизиты счета, с которого переводятся деньги
     * @param destPassport  данные паспорта пользователя, которому переводятся деньги
     * @param destRequisite реквизиты счета, на который переводятся деньги
     * @param amount        количество денег для перевода
     * @return возвращает true, если перевод денег осуществлен успешно.
     * Если один из счетов не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод во false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}
