package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (beFriend || hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("It can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);

    }
}
