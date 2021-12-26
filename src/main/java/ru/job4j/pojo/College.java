package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup(666);
        student.setStart(new Date());

        System.out.println("Student " + student.getFio() + " (group " + student.getGroup() + ") starts study on " + student.getStart());
    }
}
