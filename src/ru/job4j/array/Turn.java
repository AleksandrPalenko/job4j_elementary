package ru.job4j.array;

public class Turn {
    public static int[] back(int[] input) {
        for (int index = 0; index < input.length / 2; index++) {
            int temp = input[index];
            input[index] = input[input.length - 1 - index];
            input[input.length - 1 - index] = temp;
        }
        return input;
    }
}
