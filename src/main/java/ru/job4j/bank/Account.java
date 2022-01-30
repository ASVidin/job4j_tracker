package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных банковского счета, используемую в Bank Service
 * @author Andrey Vidin
 * @version 1.0
 */
public class Account {
    /**
     * Поле содержит информацию о реквизитах счета
     */
    private String requisite;
    /**
     * Поле содержит информацию о балансе счета
     */
    private double balance;

    /**
     * Конструктор, инициализирующий объект банковского счета
     * @param requisite реквизиты счета
     * @param balance баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод используется для получения реквизитов банковского счета
     * @return возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод принимает информацию с реквизитами и добавляет их банковскому счету
     * @param requisite реквизиты банковского счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод используется для получения баланса банковского счета
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод принимает информацию о балансе и добавляет их банковскому счету
     * @param balance баланс банковского счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод переопределяется стандартную реализацию метода из родительского класса Object.
     * Используется для сравнения банковских счетов
     * @param o банковский счет, с которым производится сравнение
     * @return возвращает Истина, если реквизиты счетов одинаковые, иначе Ложь
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод используется для получения хэш кода объекта
     * @return возвращает хэш код рассчитанный из уникального значения реквизитов счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
