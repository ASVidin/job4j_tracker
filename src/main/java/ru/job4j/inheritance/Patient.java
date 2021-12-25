package ru.job4j.inheritance;

public class Patient {
    private Diagnosis diagnosis;
    private int countOfTeeth;

    public Patient(Diagnosis diagnosis, int countOfTeeth) {
        this.diagnosis = diagnosis;
        this.countOfTeeth = countOfTeeth;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public int getCountOfTeeth() {
        return countOfTeeth;
    }
}
