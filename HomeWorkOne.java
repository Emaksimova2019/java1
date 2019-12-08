package ru.geekbrains.java_one.lesson_a.online;

public class HomeWorkOne {

    private static float one(int a, int b, int c, int d) {
        int result = (a * (b + (c / d)));
        return result;
    }

    private static boolean two(int a, int b) {
        int sum = a + b;
        boolean entry;
        if(sum > 10 && sum <= 20) {
            entry = true;
        } else {
            entry = false;
        }
        return entry;
    }

    private static void three(int a) {
        if(a < 0) {
            System.out.println("Число " + a + " отрицательное.");
        } else {
            System.out.println("Число " + a + " положительное.");
        }
    }

    private static String four(String name) {
        String hello = "Привет, " + name + "!";
        return hello;
    }

    private static void five(int year) {
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - високосный.");
        } else {
           System.out.println(year + " - не високосный.");
        }
    }

    public static void main(String[] args) {
        float result = one(2, 4, 6, 3);
        System.out.println(result);
        boolean entry = two(10, 9);
        System.out.println(entry);
        three(10);
        System.out.println(four("Катерина"));
        five(1900);
    }
}
