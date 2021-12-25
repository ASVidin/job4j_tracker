package ru.job4j.inheritance;

import java.time.LocalDate;

public class Engineer extends Profession {
    protected String language;

    public Engineer(String name, String surname, String education, LocalDate birthday, String language) {
        super(name, surname, education, birthday);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
