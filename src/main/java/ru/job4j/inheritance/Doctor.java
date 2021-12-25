package ru.job4j.inheritance;

import java.time.LocalDate;

public class Doctor extends Profession {
    private Patient[] patientList;

    public Doctor(String name, String surname, String education, LocalDate birthday, Patient[] patients) {
        super(name, surname, education, birthday);
        this.patientList = patients;
    }

    public int countPatients() {
        return patientList.length;
    }
}
