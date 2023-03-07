package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333F;
        float out = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == out;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        out = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == out;
        System.out.println("140 rubles are 2.333333 Dollar. Test result : " + passedDollar);
    }
}