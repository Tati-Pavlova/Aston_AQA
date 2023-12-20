package pavlova.tatiana.lesson2;

public class MainApp {
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = 11;
        int c = a + b;
        if (c >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
        ;
    }

    static void printColor() {
        int x = 1;

        if (x <= 0)
            System.out.println("Красный");

        else if (x > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }



    static void compareNumber() {
        int a = 3;
        int b = 7;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
    }
}
