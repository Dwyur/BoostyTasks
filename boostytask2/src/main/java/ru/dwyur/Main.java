package ru.dwyur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(getFactorial(num));
        } else {
            System.out.println("Вы ввели не число!");
        }
    }

    public static int getFactorial(int factorial) {
        int result = 1; // !1 = 1
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        return result;
    }
}