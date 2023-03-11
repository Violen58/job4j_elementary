package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean rsl = true;
        if (number < 2) {
            rsl = false;
            return rsl;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                rsl = false;
                break;
            }
        }
    return rsl;
    }
}
