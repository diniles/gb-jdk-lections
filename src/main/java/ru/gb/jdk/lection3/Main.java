package ru.gb.jdk.lection3;

public class Main {

    public static void main(String[] args) {
        GBox<String> stringBox = new GBox<>("Hello!");
        stringBox.showType();
        GBox<Integer> integerBox = new GBox<>(12);
        integerBox.showType();

        KVBox<Integer, String> kvb0 = new KVBox<>(1, "Hello");
        KVBox<String, GBox<String>> kvb1 = new KVBox<>("World", new GBox<>("Java"));
        kvb0.showType();
        kvb1.showType();
    }
}

