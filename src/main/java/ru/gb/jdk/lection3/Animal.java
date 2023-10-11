package ru.gb.jdk.lection3;

public class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " with name " + name;
    }
}
