package ru.otus.lottery;

import java.io.IOException;

/**
 * Created by tully.
 *
 * Run examples:
 * mvn package
 * java -cp target/l1.maven.jar ru.otus.lottery.Main
 * java -cp "target/l1.maven.jar:/home/tully/.m2/repository/net/sf/opencsv/opencsv/2.3/opencsv-2.3.jar" ru.otus.lottery.Main
 * java -jar target/l1.maven.jar
 *
 */
public class Main {
    private static final int MAX_WINNERS_COUNT = 3;

    public static void main(String[] args) throws IOException {
        String pathToFile = "emails.csv";

        String seedString = "May the Force be with you";

        new Lottery(
                new EmailsReader(pathToFile),
                new LotteryMachine(MAX_WINNERS_COUNT),
                seedString
        ).run();
    }
}
