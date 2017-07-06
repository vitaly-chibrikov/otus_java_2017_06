package ru.otus.l52;

import java.lang.management.ManagementFactory;

/**
 * Created by tully.
 */

public class Main {
    @AddLog(message = "Main method")
    public static void main(String... args) throws InterruptedException {
        new Main().pid();
    }

    @AddLog(message = "pid requested")
    private void pid() {
        System.out.println("Starting pid: " + ManagementFactory.getRuntimeMXBean().getName());
    }
}
