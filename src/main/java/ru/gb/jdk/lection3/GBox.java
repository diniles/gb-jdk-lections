package ru.gb.jdk.lection3;

public class GBox<T> {
    private T value;

    public GBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void showType() {
        System.out.printf("Type is %s, which value is %s\n", value.getClass().getName(), getValue());
    }

    public <T> void setIfNull(GBox<T> box, T t) {
        if (box.getValue() == null) {
            box.setValue(t);
        }
    }
}
