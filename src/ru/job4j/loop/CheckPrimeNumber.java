package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        prime = number > 1;
        for (int i = 2; i < number - 1; i++) {
            if (i % i == 1 && number % 1 == 1) {
                break;
            }
        }
        return true;
    }
}
