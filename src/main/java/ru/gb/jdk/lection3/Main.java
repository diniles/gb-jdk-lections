package ru.gb.jdk.lection3;

public class Main {

    public static void main(String[] args) {
        Box b1 = new Box(20);
        Box b2 = new Box(30);
        System.out.println((Integer) b1.getObj() + (Integer) b2.getObj());

        Box b3 = new Box("Hello, ");
        Box b4 = new Box("World!");
        System.out.println(b3.getObj() + (String) b4.getObj());
    }
}

