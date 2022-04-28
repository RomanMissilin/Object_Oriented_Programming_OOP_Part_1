package ru.skypro;

import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String student, int nobility, int honour, int bravery) {
        super(student);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honour == that.honour && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honour, bravery);
    }
}
