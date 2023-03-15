package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 0; row <= size - 1; row++) {
            int element = 0;
            for (int cell = 0; cell <= size - 1; cell++) {
                element = element + row + 1;
                array[row][cell] = element;
            }
        }
        return array;
    }
}
