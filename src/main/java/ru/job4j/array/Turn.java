package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
            if (i >= j) {
                break;
            }
        }
        return array;
    }
}
