package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] nums, int source, int dest) {
        int temp = nums[dest];
        nums[dest] = nums[source];
        nums[source] = temp;
        return nums;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
