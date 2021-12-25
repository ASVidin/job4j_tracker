package ru.job4j.inheritance;

import java.time.LocalDate;

public class Surgeon extends Doctor {
    private int workExperience;

    public Surgeon(String name, String surname, String education, LocalDate birthday, Patient[] patients, int workExperience) {
        super(name, surname, education, birthday, patients);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }
}
