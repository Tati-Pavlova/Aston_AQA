package pavlova.tatiana.lesson3;

import java.util.Arrays;

public class MainApp {
    static boolean isInRangeFrom10to20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    static void printIsPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isPositiveOrNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

    static void printNtimes(String a, int b) {
        for (int i = 0; i < b; ++i) {
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

    static void printArrayFrom1to100() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = 1 + i;
        System.out.println(Arrays.toString(array));
    }

    static void multiplyBy2NumbersLess6() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) array[i] *= 2;
        System.out.println(Arrays.toString(array));
    }

    static void fillDiagonalWith1() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] returnOneDimensionalArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    
    public static void main(String[] args) {
        isInRangeFrom10to20(5, 8);
        printIsPositiveOrNegative(3);
        isPositiveOrNegative(0);
        printNtimes("Hello", 4);
        isLeapYear(2024);
        switchArrayElements();
        printArrayFrom1to100();
        multiplyBy2NumbersLess6();
        fillDiagonalWith1();
        returnOneDimensionalArray(7, 2);
    }
}
