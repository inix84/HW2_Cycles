public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. С помощью цикла for выведите " +
                "в консоль все целые числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 2. С помощью цикла for выведите " +
                "в консоль все целые числа от 10 до 1:");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        System.out.println();
        System.out.println("Задача 3. Выведите в " +
                "консоль все четные числа от 0 до 17:");
        for (int q = 0; q < 17; q = q + 2) {
            System.out.println(q);
        }
        System.out.println();
        System.out.println("Задача 4. Выведите в консоль все числа " +
                "от 10 до −10 от бо́льшего числа к меньшему:");
        for (int w = 10; w >= -10; w--) {
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println("Задача 5. Високосные года, начиная с 1904 года до 2096:");
        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }
        System.out.println();
        System.out.println("Задача 6. Напишите программу, которая выводит " +
                "в консоль последовательность чисел c 7 до 98:");
        for (int r = 7; r <= 98; r = r + 7) {
            System.out.print(r + " ");
        }
        System.out.println();
        System.out.println("Задача 7. Напишите программу, которая " +
                "выводит в консоль последовательность чисел c 1 до 512:");
        for (int t = 1; t <= 512; t = t * 2) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println("Задача 8. Про сумму годовых накоплений в реальной банке:");
        int total = 0; // инвариант накоплений
        for (int y = 1; y <= 12; y++) { // переменная будет месяцем
            total = total + 29000;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача 9. Про сумму годовых накоплений в коммерческом банке:");
        float total2 = 0; // инвариант накоплений
        for (int u = 1; u <= 12; u++) { // переменная будет месяцем
            total2 = total2 + 29000; // сумма пролежала месяц
            total2 = total2 * (float) 1.01; // и с нее добавили 1 %
            System.out.println("Месяц " + u + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println();
        System.out.println("Задача 10. Напишите программу, " +
                "которая выводит в консоль таблицу умножения на 2:");
        for (int o = 1; o <= 10; o++) {
            System.out.println("2*"+o+"="+2*o);
        }
    }
}