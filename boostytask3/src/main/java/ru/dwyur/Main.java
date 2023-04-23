package ru.dwyur;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            getMultiplesNumber(num);
        } else {
            System.out.println("Вы ввели не число!");
        }
    }


    public static void getMultiplesNumber(int number) {

        // Если число отрицательно
        if (number < 0) {
            System.out.println("Ошибка! Не используйте отрицательные числа");
            return;
        }

        // Если число меньше двух, но больше -1 (0 или 1)
        if (number < 2 && number > -1) {
            System.out.println("Ошибка! Ваше число меньше двух!");
            return;
        }

        int[] multiples = new int[number];
        int index = 0;
        for(int i = 1; i <= number ; i++) {
            if(i % 2 == 0) {
                if (i==number) {
                    System.out.print(i);
                } else {
                    System.out.printf("%d, ", i);
                }
                multiples[index] = i;
                index++;
            }
        }

        int num = 0;
        for(int i2 = 0; i2<index; i2++)
            num += multiples[i2];

        System.out.println("; " + num);
    }
}