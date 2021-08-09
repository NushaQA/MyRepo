package test3;

import java.util.Scanner;

public class Test3Class {
    public static void main(String[] args) {
        /* Task1: Создайте программу, выводящую на экран все четырёхзначные
        числа последовательности 1000 1003 1006 1009 1012 1015 */

        for (int i = 1000; i <= 9999; ) {
            System.out.println(i);
            i += 3;
        }

        /* Task2: Создайте программу, вычисляющую факториал натурального числа n,
        которое пользователь введёт с клавиатуры.
        https://javarush.ru/groups/posts/klass-scanner
        Факториал числа n — это произведение натуральных чисел от 1 до n.
        Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int res = 1;
            if (number < 0) {
                System.out.println("Извините, Вы ввели не натуральное число и у него нет факториала. Перезапустите программу и попробуйте снова!");
            } else if (number == 0) {
                System.out.println("Спасибо! Вы ввели число " + number);
                System.out.println("Факториал Вашего числа равен " + res);
            } else {
                for (int i = 1; i <= number; i++) {
                    res = res*i;
                }
                System.out.println("Спасибо! Вы ввели число " + number);
                System.out.println("Факториал Вашего числа равен " + res);
            }
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }



        /*int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a<=1); */


    }
}