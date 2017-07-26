package ru.otus.l71.behavioral.visitor.bad;

/**
 * Created by tully.
 * <p>
 * Element in the Visitor patter.
 */
public interface CarElement {
    String getName();

    void doWash();

    void doRepair();
}
