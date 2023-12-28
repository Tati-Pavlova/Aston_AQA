package pavlova.tatiana.lessons;

public class MainApp {
    public static void main(String[] args)  {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иван Иванов", "Программист", "tati@mail.ru", "+71112223344", 50000, 44);
        persArray[1] = new Person("Петр Петров", "Аналитик", "tati8@mail.ru", "+71232336676", 70000, 43);
        persArray[2] = new Person("Виталий Сидоров", "Тестировщик", "tati7@mail.ru", "+71256667890", 80000, 42);
        persArray[3] = new Person("Максим Прохоров", "Менеджер", "tati6@mail.ru", "+79812345643", 90000, 41);
        persArray[4] = new Person("Василий Попов", "Тим Лид", "tati5@mail.ru", "+78768884352", 13450, 40);

        persArray[0].print();
    }

}




