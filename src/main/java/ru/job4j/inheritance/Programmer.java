package ru.job4j.inheritance;

import java.time.LocalDate;

public class Programmer extends Engineer {
    private String skill;

    public Programmer(String name, String surname, String education, LocalDate birthday, String language) {
        super(name, surname, education, birthday, language);
    }

    public boolean fixProgram(Program program) {
        return !program.isWorking() && language.equals(program.getLanguage());
    }

    public String getSkill() {
        return skill;
    }
}
