package ru.gb.jdk.lection3;

public class Main {

    public static void main(String[] args) {
        GBox<String> stringBox = new GBox<>("Hello!");
        stringBox.showType();
        GBox<Integer> integerBox = new GBox<>(12);
        integerBox.showType();
    }
}

