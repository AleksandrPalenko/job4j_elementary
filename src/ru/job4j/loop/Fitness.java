package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {
            nik = nik * 2;
            ivan = ivan * 3;
            month++;
        }
        return month;
    }
}
