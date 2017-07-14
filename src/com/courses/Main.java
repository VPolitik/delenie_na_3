package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нужное число: ");
        a = in.nextInt();
        if (a % 3 == 0) {
            System.out.println("Введенное вами число делится на 3 ");
            sum = a / 3;
            System.out.println("Результат деления будет = " + sum);
        } else {
            System.out.println("При деление на три будет остаток! ");
            sum = a / 3;
            System.out.println("Результат деления будет = " + sum);
        }
    }
}
