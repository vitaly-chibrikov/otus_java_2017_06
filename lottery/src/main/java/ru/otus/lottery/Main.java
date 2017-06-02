package ru.otus.lottery;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by tully.
 */
public class Main {
    private static final int MAX_WINNERS_COUNT = 2;

    public static void main(String[] args) throws IOException {
        String pathToFile = "emails.csv";

        String seedString = "Andrey Ryabinskiy\u200BПодключиться к\uFEFF апи другого сервиса, который выдаёт более \"трушные\" случайные числа\n" +
                "\n" +
                "Iki イッキ\u200BТогда круто\uFEFF\n" +
                "\n" +
                "idolin\u200BЧики-брики и\uFEFF в дамки\n" +
                "\n" +
                "Сергей Тишин\u200Bа насколько получится одновременно работать и учиться?\uFEFF\n" +
                "\n" +
                "Iki イッキ\u200BЕсли\uFEFF получается тот же амый результат, то тоже не случайные числа\n" +
                "\n" +
                "Андрей Пугаченко\u200Bблин люблю жаву но какая ж\uFEFF она многословная\n" +
                "\n" +
                "Андрей Пугаченко\u200Bпосле питона\uFEFF";

        Lottery lottery = new Lottery(
                new EmailsReader(pathToFile),
                new LotteryMachine(MAX_WINNERS_COUNT),
                seedString
        );
        lottery.run();

        String epartsFile = "eparts.txt";
        Files.write(Paths.get(epartsFile), lottery.getEmailsPart(8), Charset.defaultCharset());
        System.out.println("Parts of emails saved to: " + epartsFile);
    }

}
