package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int mult = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mult = mult * i * j;
            }
        }
        return table;
    }
}
