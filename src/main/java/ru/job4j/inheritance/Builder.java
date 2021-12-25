package ru.job4j.inheritance;

import java.time.LocalDate;

public class Builder extends Engineer {
    private int salary;

    public Builder(String name, String surname, String education, LocalDate birthday, String language) {
        super(name, surname, education, birthday, language);
    }

    public Program createProgram() {
        return new Program(true, language);
    }

    public int getSalary() {
        return salary;
    }
}
