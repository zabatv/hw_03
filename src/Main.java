public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        
        var balance = 0;
        for (int moth = 1; moth <= 12; moth++) {
            balance += 29000;
            System.out.println("В " + moth + "-ом месяце бюджет состовляет " + balance);
        }

        System.out.println("Задание 9");
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.

        balance = 0;
        for (int moth = 1; moth <= 12; moth++) {
            balance += 29000;
            balance -= 290;
            System.out.println("В " + moth + "-ом месяце бюджет состовляет " + balance);
        }

        System.out.println("Задание 10");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2.

        var summ = 0;
        for (int i = 1; i <= 10; i++) {
            summ = 0;
            summ = i * 2;
            System.out.println("2 * " + i + " = " + summ);
        }

    }
}