package ru.gb.jdk.lection3;

public class KVBox<K, V> {
    private final K key;
    private final V value;

    public KVBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void showType() {
        System.out.printf("Type of key is %s, k = %s, type of value is %s, value = %s\n",
                key.getClass().getName(), getKey(),
                value.getClass().getName(), getValue());
    }
}
