package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = ThreeMax.max(9, 1, 5);
        System.out.println(rsl);
        rsl = ThreeMax.max(1, 100, 100);
        System.out.println(rsl);
    }
}
