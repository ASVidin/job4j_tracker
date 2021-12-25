package ru.job4j.inheritance;

import java.time.LocalDate;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, LocalDate birthday, Patient[] patients) {
        super(name, surname, education, birthday, patients);
    }

    public int inspectionTeeth(Patient patient) {
        return patient.getCountOfTeeth();
    }
}
