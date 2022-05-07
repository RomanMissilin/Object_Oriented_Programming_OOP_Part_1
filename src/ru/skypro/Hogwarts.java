package ru.skypro;

import java.util.Objects;

public class Hogwarts {

    private String student;
    private int Force;

    public Hogwarts(String student, int force) {
        this.student = student;
        this.Force = force;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getForce() {
        return Force;
    }

    public void setForce(int force) {
        Force = force;
    }
}