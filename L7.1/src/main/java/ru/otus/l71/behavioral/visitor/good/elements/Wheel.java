package ru.otus.l71.behavioral.visitor.good.elements;

import ru.otus.l71.behavioral.visitor.good.CarElement;
import ru.otus.l71.behavioral.visitor.good.Service;

/**
 * Created by tully.
 */
public class Wheel implements CarElement {
    @Override
    public String getName() {
        return "wheel";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}
