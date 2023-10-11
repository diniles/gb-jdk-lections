package ru.gb.jdk.lection3;

public class BBox<V extends Number> {
    private V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <T extends Number> void setIfNull(BBox<T> box, T t) {
        if (box.getValue() == null) {
            box.setValue(t);
        }
    }
}
