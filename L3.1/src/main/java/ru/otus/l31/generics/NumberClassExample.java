package ru.otus.l31.generics;

/**
 * Created by tully.
 */
public class NumberClassExample extends GenericClassExample<String> {
    public NumberClassExample(Number value) {
        super("value");
    }
}
