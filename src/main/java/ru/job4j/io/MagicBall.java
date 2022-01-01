package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи закрытый вопрос для предсказания или \"stop\" для завершения:");
        String answer = scanner.nextLine();
        while (!"stop".equals(answer)) {
            switch (new Random().nextInt(3)) {
                case 0 -> System.out.println("ДА");
                case 1 -> System.out.println("НЕТ");
                default -> System.out.println("Может быть");

            }
            answer = scanner.nextLine();
        }
    }
}
