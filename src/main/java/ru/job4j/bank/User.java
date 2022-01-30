package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных Пользователь банка, используемую в Bank Service
 * @author Andrey Vidin
 * @version 1.0
 */
public class User {
    /**
     * Поле хранит информацию о данных паспорта Пользователя
     */
    private String passport;
    /**
     * Поле хранит информацию о ФИО Пользователя
     */
    private String username;

    /**
     * Конструктор, который инициализирует Пользователя
     * @param passport Данные паспорта Пользователя
     * @param username ФИО Пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод используется для получения данных паспорта Пользователя
     * @return возвращает данные паспорта Пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод принимает информацию с данными паспорта пользователя и добавляет их пользователю
     * @param passport данные паспорта Пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод используется для получения информации о ФИО Пользователя
     * @return возвращает информацию о ФИО Пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод принимает информацию о ФИО пользователя и добавляет ее пользователю
     * @param username ФИО Пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод переопределяется стандартную реализацию метода из родительского класса Object.
     * Используется для сравнения Пользователей
     * @param o Пользователь, с которым производится сравнение
     * @return возвращает Истина, если данные паспорта пользователей одинаковые, иначе Ложь
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод используется для получения хэш кода объекта
     * @return возвращает хэш код рассчитанный из уникального значения паспортных данных Пользователя
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
