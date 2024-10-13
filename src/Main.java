public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Копим 2 459 000 руб c помощью цикла ПОКА:");
        int i = 0; // инвариант, начинаем копить с нуля
        int n = 0; // счетчик месяцев
        while (i <= 2459000) {
            i = i + 15000;
            n++;
        }
        System.out.println("Месяц " + n + " сумма накоплений равна " + i + " рублей.");
        System.out.println();
        System.out.println("Задача 2. В двух строках через пробел числа от 1 до 10 и от 10 до 1:");
        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.print(".");
        System.out.println();
        while (q > 1) { // на данном шаге q=11
            q--;
            System.out.print(q + " ");
        }
        System.out.print(".");
        System.out.println();
        System.out.println();
        System.out.println("Задача 3. Рождаемость:");
        float y = 12_000_000; // В стране Y население — 12 миллионов человек
        int w = 0; // счетчик годов, 10 лет нужно
        float k; // коэффициент 12 млн : 1 тыс
        while (w < 10) {
            w++;
            k = y / 1000; // расчет коэффициента на 1000 населения
            y = y + 17 * k - 8 * k;
            System.out.println("Год " + w + " - численность населения составляет " + (int) y + ".");
        }
        System.out.println();
        System.out.println("Задача 4. Копим Василию 12 млн:");
        float e = 15_000; // инвариант, начинаем копить 15000 рублей
        float r = 1.07f; // 7% от банка
        int t = 0; // счетчик месяцев
        while (e < 12_000_000) {
            t++;
            e = e * r;
            System.out.println("Через " + t + " месяц(ев), сумма накоплений равна " + (int) e + " рублей.");
        }
        System.out.println();
        System.out.println("Задача 5. Копим Василию 12 млн: (СОКР.ВЕРСИЯ)");
        float a = 15_000; // инвариант, начинаем копить 15000 рублей
        float s = 1.07f; // 7% от банка
        int d = 0; // счетчик месяцев
        while (a < 12_000_000) {
            d++;
            a = a * s;
            if (d % 6 == 0) {
                System.out.println("Через " + d + " месяц(ев), сумма накоплений равна " + (int) a + " рублей.");
            }
        }
        System.out.println("(Если Василию интересно, то) ИТОГ: Через " + d + " месяц(ев), сумма накоплений равна " + (int) a + " рублей.");
        System.out.println();
        System.out.println("Задача 6. Василий & 9 лет банка:");
        float z = 15_000; // инвариант, начинаем копить 15000 рублей
        float x = 1.07f; // 7% от банка
        int v = 9; // срок 9 лет
        int c = 0; // счетчик месяцев
        while (c < 12 * v) {
            c++;
            z = z * x;
            if (c % 6 == 0) {
                System.out.println("Через " + c + " месяц(ев), сумма накоплений равна " + (int) z + " рублей.");
            }
        }
        System.out.println();
        System.out.println("Задача 7. Пятница — отчетный день:");
        int u = 5; //
        while (u < 31) {
            System.out.println("Сегодня пятница, " + u + "-е число. Необходимо подготовить отчет!!!");
            u = u + 7;
        }
        System.out.println();
        System.out.println("Задача 8. Астрономическое приложение:");
        int year = 2024;
        int currentYear = year - 200; // инвариант изменяющегося года
        int year100 = year + 100;
        while (currentYear <= year100) {
            currentYear++;
            if (currentYear % 79 == 0) {
                System.out.println(currentYear);
            }

        }
    }
}
