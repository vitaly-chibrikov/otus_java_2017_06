package ru.otus.l71.behavioral.visitor.bad.elements;


import ru.otus.l71.behavioral.visitor.bad.CarElement;

/**
 * Created by tully.
 */
public class Wheel implements CarElement {
    @Override
    public String getName() {
        return "wheel";
    }

    @Override
    public void doWash() {
        System.out.println("Washing: " + this.getName());
    }

    @Override
    public void doRepair() {
        System.out.println("Repairing: " + this.getName());
    }

}
