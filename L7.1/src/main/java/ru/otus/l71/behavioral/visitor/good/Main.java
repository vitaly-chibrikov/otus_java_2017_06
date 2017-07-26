package ru.otus.l71.behavioral.visitor.good;

import ru.otus.l71.behavioral.visitor.good.services.CarRepairService;
import ru.otus.l71.behavioral.visitor.good.services.CarWashService;

/**
 * Created by tully.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.doService(new CarRepairService());
        car.doService(new CarWashService());
    }
}
