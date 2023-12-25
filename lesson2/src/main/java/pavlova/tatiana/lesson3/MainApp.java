package pavlova.tatiana.lesson3;

import java.util.Arrays;

public class MainApp {
    static boolean isInRangeFrom10to20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20)
            return true;
        else
            return false;
    }

    static void printIsPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    static boolean isPositiveOrNegative(int a) {
        if (a < 0)
           return true;
        else
            return false;
    }

    static void printNtimes(String a, int b) {
        for(int i = 0; i < b; ++i) {
            System.out.println(a);
        }

    }

    static void isLeapYear(int year) {
        if (!(year % 4 == 0) && (year % 100 == 0) && !(year % 400 == 0)) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год високосный");
        }

    }

    static void switchArrayElements() {
        int[] array = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        isInRangeFrom10to20(5,8);
        printIsPositiveOrNegative(3);
        isPositiveOrNegative(0);
        printNtimes("Hello", 4);
        isLeapYear(2024);
        switchArrayElements();

    }

}
