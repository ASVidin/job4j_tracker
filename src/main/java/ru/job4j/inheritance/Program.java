package ru.job4j.inheritance;

public class Program {
    private boolean working;
    private String language;

    public Program(boolean working, String language) {
        this.working = working;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isWorking() {
        return working;
    }
}
