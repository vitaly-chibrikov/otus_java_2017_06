package ru.otus.l71.behavioral.visitor.good;

import ru.otus.l71.behavioral.visitor.good.elements.Body;
import ru.otus.l71.behavioral.visitor.good.elements.Engine;
import ru.otus.l71.behavioral.visitor.good.elements.Wheel;

/**
 * Created by tully.
 * <p>
 * Visitor in the Visitor pattern.
 * An abstract service for elements of a car.
 */
public interface Service {

    void visit(Wheel element);

    void visit(Engine element);

    void visit(Body element);
}
