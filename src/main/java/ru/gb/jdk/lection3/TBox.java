package ru.gb.jdk.lection3;

public class TBox<T> {
    public static final TBox EMPTY_BOX = new TBox<>();
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    static <T> TBox<T> emptyBox() {
        return (TBox<T>) EMPTY_BOX;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
