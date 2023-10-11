package ru.gb.jdk.lection3;

public class Animal {
    protected String name;

    protected Animal() {
        this.name = "Animal";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
