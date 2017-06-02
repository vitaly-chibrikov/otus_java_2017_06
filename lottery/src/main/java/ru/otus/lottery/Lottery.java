package ru.otus.lottery;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by tully.
 */
class Lottery {
    private final Supplier<List<String>> emailsSource;
    private final LotteryMachine machine;
    private final String seedString;

    Lottery(Supplier<List<String>> emailsSource, LotteryMachine machine, String seedString) {
        this.emailsSource = emailsSource;
        this.machine = machine;
        this.seedString = seedString;
    }

    void run() {
        List<String> emails = emailsSource.get();

        System.out.println(TextColors.ANSI_RED + "Emails count: " + emails.size());

        List<String> winners = machine.setSeed(seedString).draw(emails);

        System.out.println(TextColors.ANSI_BLUE + "Winners:");
        winners.forEach(System.out::println);
    }

    List<String> getEmailsPart(int maxChars) throws IOException {
        return emailsSource.get()
                .stream()
                .map(email -> email.substring(0, Math.min(email.indexOf("@"), maxChars)))
                .collect(Collectors.toList());
    }
}
