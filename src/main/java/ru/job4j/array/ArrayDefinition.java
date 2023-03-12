package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Zero";
        names[1] = "One";
        names[2] = "Two";
        names[3] = "Three";
        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
