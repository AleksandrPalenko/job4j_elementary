package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, i, 0, data.length - 1);
            int[] arraySwap = SwitchArray.swap(data, 0, data.length - 1);
        }
        return data;
    }

}
