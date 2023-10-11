package ru.gb.jdk.lection3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        GBox<String> stringBox = new GBox<>("Hello!");
//        stringBox.showType();
//        GBox<Integer> integerBox = new GBox<>(12);
//        integerBox.showType();
//
//        KVBox<Integer, String> kvb0 = new KVBox<>(1, "Hello");
//        KVBox<String, GBox<String>> kvb1 = new KVBox<>("World", new GBox<>("Java"));
//        kvb0.showType();
//        kvb1.showType();

//        GBox<Integer> box = new GBox<>(null);
//        box.setIfNull(box, 13);
//        System.out.println(box.getValue());
//        GBox<Integer> box0 = new GBox<>(1);
//        box0.setIfNull(box, 13);
//        System.out.println(box0.getValue());
//        BBox<Integer> integerBBox = new BBox<>();
//        BBox< String> stringBBox = new BBox<>();
//        BBox.setIfNull(integerBBox, 4);
//        BBox.setIfNull(stringBBox, "hello");

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(new Cat()));
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Animal()));
//        copyTo(animals, cats);
        copyTo(cats, animals);
        System.out.println(cats);
//        cats.get(1).voice();
    }

    public static <T> void copyTo(ArrayList<? extends T> src, ArrayList<? super T> dst) {
        for (T o : src) {
            dst.add(o);
        }
    }
}

